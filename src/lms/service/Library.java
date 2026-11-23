
package lms.service;

import lms.model.Book;
import lms.model.DVD;
import lms.model.LibraryItem;
import lms.model.Magazine;
import lms.model.Member;
import lms.model.Loanable;
import lms.model.Reservable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library
{

    private List<LibraryItem> items;
    private List<Member> members;

    public Library()
    {
        items = new ArrayList<>();
        members = new ArrayList<>();
    }


    public void addItem(LibraryItem item)
    {
        items.add(item);
    }

    public void addItem(Book book)
    {
        items.add(book);
    }

    public void addItem(DVD dvd)
    {
        items.add(dvd);
    }

    public void addItem(Magazine magazine)
    {
        items.add(magazine);
    }

    public void addMember(Member member)
    {
        members.add(member);
    }

    public void listItems()
    {
        for (LibraryItem item : items)
        {
            System.out.println(item);
        }
    }

    public void listMembers()
    {
        for (Member member : members)
        {
            System.out.println(member.getName());
        }
    }

    public void printAllLateFees(int daysLate)
    {
        for (LibraryItem item : items)
        {
            System.out.println(item.getTitle() + ": "
                            + item.calculateLateFee(daysLate));
        }
    }

    public void streamIfPossible(LibraryItem item)
    {
        item.stream();
    }
    public void lend(Loanable thing, Member member)
    {
        thing.loan(member);
    }


    public void reserveIfPossible(LibraryItem item, Member member) {
        if (item instanceof Reservable r)
        {
            r.reserve(member);
        }
        else
        {
            System.out.println(item.getTitle() + " cannot be reserved.");
        }
    }


    public void printMembersByActivity()
    {
        List<Member> sortedMembers = new ArrayList<>(members);

        Collections.sort(sortedMembers);

        for (Member member : sortedMembers)
        {
            System.out.println(
                    member.getName()
                            + " (" + member.getBorrowedCount()
                            + " borrowed)");
        }
    }
}
