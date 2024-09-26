//Assignment 3: Door Access Control
//Write a program that simulates an access control system. A person is allowed access if
//they have both a valid ID and a valid access card, or if they are an admin.
//Requirements:
//•    Use logical operators &&, ||, and !.

package assignment;



import java.util.Scanner;

public class DoorAccessControl {
    private boolean validId;
    private boolean validAccessCard;
    private boolean Admin;
    Scanner sc = new Scanner(System.in);

    void set() {
        System.out.println("you have a valid ID");
        String idInput = sc.next();
        validId = idInput.equals("yes");
        System.out.println("you have a valid access card");
        String cardInput = sc.next();
        validAccessCard = cardInput.equals("yes");
        System.out.println("Are you an admin");
        String adminInput = sc.next();
        Admin = adminInput.equals("yes");
    }

    void check() {
      
        if (Admin || (validId && validAccessCard)) {
            System.out.println("Door Access Granted");
        } else {
            System.out.println("Door Access Not Granted");
        }
    }

    public static void main(String[] args) {
        DoorAccessControl d = new DoorAccessControl();
        d.set();
        d.check();
    }
}