package lms;

import lms.model.Book;
import lms.model.DVD;
import lms.model.Magazine;
import lms.model.Student;
import lms.model.Staff;
import lms.service.Library;

public class Main
{

    public static void main(String[] args)
    {

        Library library = new Library();
        Book book = new Book("B001", "Clean Code", "Robert C. Martin");

        DVD dvd = new DVD("D001", "Introduction to Algorithms", 120);

        Magazine magazine = new Magazine("M001", "Software Weekly", 15);

        Student student = new Student("M001", "Nadeesha Perera");

        Staff staff = new Staff("M002", "Mr. Kasun Silva");

        library.addItem(book);
        library.addItem(dvd);
        library.addItem(magazine);

        library.addMember(student);
        library.addMember(staff);

        System.out.println("--- Late fees if 3 day(s) late ---");

        library.printAllLateFees(3);
        System.out.println("--- Loans ---");

        library.lend(book, student);
        library.lend(book, staff);
        library.lend(dvd, staff);
        library.lend(magazine, staff);

        System.out.println("--- Reservations ---");

        library.reserveIfPossible(book, staff);
        library.reserveIfPossible(dvd, staff);

        library.printMembersByActivity();


    }

}
