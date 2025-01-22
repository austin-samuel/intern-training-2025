package model;

import repo.MemberRepo;

import java.util.Scanner;

public class Member extends Person{

    private int memberId;
    private int issuedBooksCount; //default 0

    public int getIssuedBooksCount() {
        return issuedBooksCount;
    }

    public void setIssuedBooksCount(int issuedBooksCount) {
        this.issuedBooksCount = issuedBooksCount;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    void issueBook(Book book)
    {
        // input memberId and check issuedBooksCount against it.
        // using hashmap to store Member details corresponding to MemberId.

        System.out.print("Enter memberId: ");
        Scanner myObj = new Scanner(System.in);
        int memberId = myObj.nextInt();

        // fetch member details and check for issuedBookCount
        Member member = MemberRepo.getMember(memberId);
        if(member.issuedBooksCount < 3) {

            member.issuedBooksCount++;
            book.issueBook();
            LibraryAdmin.totalBookIssued++;
        }
        else {
            System.out.println("No more books can be issued. Max 3 limit reached.");
        }
    }



}
