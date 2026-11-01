package lms;
import lms.model.Book;
import lms.model.DVD;
import lms.model.LibraryItem;
import lms.model.Staff;
import lms.model.Student;
import lms.service.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(
                "B001", "Clean Code", "Robert C. Martin");

        Book book2 = new Book(
                "B002", "Effective Java", "Joshua Bloch");

        DVD dvd1 = new DVD(
                "D001", "Introduction to Algorithms", 120);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);

        library.addMember(
                new Student("M001", "Nadeesha Perera"));

        library.addMember(
                new Staff("M002", "Kasun Silva"));

        library.listItems();
        System.out.println();

        library.listMembers();
        System.out.println();

        library.printAllLateFees(3);
        System.out.println();

        System.out.println("--- Streaming Test ---");

        library.streamIfPossible(dvd1);
        library.streamIfPossible(book1);

        System.out.println();

        try {
            new Book("B003", "", "Unknown Author");
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Rejected invalid book: " + e.getMessage());
        }

        System.out.println();


        System.out.println("--- Binding Test ---");

        Book b = new Book(
                "B004", "Java Basics", "John Smith");

        LibraryItem same = b;

        library.addItem(b);
        library.addItem(same);
    }
}
