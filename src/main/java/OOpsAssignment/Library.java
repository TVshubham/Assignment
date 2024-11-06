package OOpsAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    public Map<String, Book> books;
    private Map<String, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public void issueBook(String memberId, String bookISBN) {
        Member member = members.get(memberId);
        Book book = books.get(bookISBN);

        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
            System.out.println("OOpsAssignment.Book issued to member: " + member.getName());
        } else {
            System.out.println("Issue failed. Either member or book not found, or book unavailable.");
        }
    }

    public void receiveBook(String memberId, String bookISBN) {
        Member member = members.get(memberId);
        Book book = books.get(bookISBN);

        if (member != null && book != null) {
            member.returnBook(book);
            System.out.println("OOpsAssignment.Book returned by member: " + member.getName());
        } else {
            System.out.println("Return failed. Either member or book not found.");
        }
    }

    public void listAllBooks() {
        System.out.println("OOpsAssignment.Library Books:");
        for (Book book : books.values()) {
            System.out.println(book.getDetails() + ", Copies: " + book.getCopies());
        }
    }

    public List<Book> searchBooksByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getDetails().contains(title)) {
                result.add(book);
            }
        }
        return result;
    }
}