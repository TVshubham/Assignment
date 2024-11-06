package OOpsAssignment;

import java.util.Map;

public class Librarian extends Person {
    private String employeeId;

    public Librarian(String name, String employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void addBook(OOpsAssignment.Book book, Map<String, OOpsAssignment.Book> books) {
        books.put(book.getISBN(), book);
    }

    public void removeBook(Book book, Map<String, OOpsAssignment.Book> books) {
        books.remove(book.getISBN());
    }

    public void viewInventory(Map<String, OOpsAssignment.Book> books) {
        System.out.println("OOpsAssignment.Library Inventory:");
        for (OOpsAssignment.Book book : books.values()) {
            System.out.println(book.getDetails() + ", Copies: " + book.getCopies());
        }
    }

    @Override
    public String getDetails() {
        return "OOpsAssignment.Librarian Name: " + name + ", Employee ID: " + employeeId;
    }
}
