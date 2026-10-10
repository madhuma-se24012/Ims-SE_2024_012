
import lms.model.Book;
import lms.model.DVD;
import lms.model.Student;
import lms.model.Staff;
import lms.service.Library;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("M001", "Nadeesha Perera");
        Staff staff = new Staff("M002", "Kasun Silva");

        //System.out.println(student.getMaxBorrowLimit());
        //System.out.println(staff.getMaxBorrowLimit());

        Library library = new Library();

        library.addItem(
                new Book("B001", "Clean Code","Robert C.Martin")

        );
        library.addItem(

                new Book("B002","Effective Java","Joshua Bloch")
        );


        library.addItem(
                new DVD("D001", "Introduction to Algorithms", 120)
        );

        library.addMember(student);
        library.addMember(staff);

        library.listItems();
        library.listMembers();


        library.printAllLateFees(3);
        try {
            new Book("B003", "", "Nobody");
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected invalid book: " + e.getMessage());
        }
    }
}
