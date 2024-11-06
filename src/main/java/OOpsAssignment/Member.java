package OOpsAssignment;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        super(name);
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
        } else {
            System.out.println("OOpsAssignment.Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
        } else {
            System.out.println("OOpsAssignment.Book not found in borrowed list.");
        }
    }

    public void listBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book.getDetails());
        }
    }

    @Override
    public String getDetails() {
        return "OOpsAssignment.Member Name: " + name + ", OOpsAssignment.Member ID: " + memberId;
    }
}
