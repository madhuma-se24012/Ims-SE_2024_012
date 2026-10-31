package lms;

import lms.model.Book;
import lms.model.DVD;
import lms.model.Staff;
import lms.model.Student;
import lms.service.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        // Add books
        library.addItem(
                new Book("B001", "Clean Code", "Robert C. Martin"));

        library.addItem(
                new Book("B002", "Effective Java", "Joshua Bloch"));

        // Add DVD
        library.addItem(
                new DVD("D001", "Introduction to Algorithms", 148));

        // Add members
        library.addMember(
                new Student("M001", "Nadeesha Perera"));

        library.addMember(
                new Staff("M002", "Kasun Silva"));

        // Display items and members
        library.listItems();
        System.out.println();

        library.listMembers();
        System.out.println();

        // Calculate late fees for 3 days
        library.printAllLateFees(3);
        System.out.println();

        // Test invalid book title
        try {
            new Book("B003", "", "Unknown Author");
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Rejected invalid book: " + e.getMessage());
        }
    }
}
