package OOpsAssignment;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        Book book1 = new Book("Java Programming", "John Doe", "ISBN123", 5);
        Book book2 = new Book("Data Structures", "Jane Smith", "ISBN456", 2);

        // OOpsAssignment.Librarian to manage books
        Librarian librarian = new Librarian("Alice", "EMP001");
        librarian.addBook(book1, library.books);
        librarian.addBook(book2, library.books);

        // Registering a member
        Member member = new Member("Bob", "MEM001");
        library.registerMember(member);

        // OOpsAssignment.Librarian views inventory
        librarian.viewInventory(library.books);

        // OOpsAssignment.Member borrows a book
        library.issueBook("MEM001", "ISBN123");

        // OOpsAssignment.Member lists borrowed books
        member.listBorrowedBooks();

        // OOpsAssignment.Member returns the book
        library.receiveBook("MEM001", "ISBN123");

        // Search books by title
        List<Book> searchResults = library.searchBooksByTitle("Java");
        System.out.println("Search Results:");
        for (Book book : searchResults) {
            System.out.println(book.getDetails());
        }
    }
}
