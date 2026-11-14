package lms;

import lms.model.Book;
import lms.model.DVD;
import lms.model.LibraryItem;
import lms.model.Student;
import lms.model.Staff;
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


        Student student1 = new Student(
                "M001", "Nadeesha Perera");

        Staff staff1 = new Staff(
                "M002", "Kasun Silva");
        DVD d1 = new DVD("D1", "Test DVD", 120);



        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);

        library.addMember(student1);
        library.addMember(staff1);

        library.listItems();

        System.out.println();


        library.listMembers();

        System.out.println();


        library.printAllLateFees(3);

        System.out.println();

        LibraryItem item = dvd1;

        library.streamIfPossible(item);
        library.streamIfPossible(book1);
    }

}
