package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
	    System.out.println("What is your first name?");

	    String firstName = kbInput.nextLine();

	    System.out.println("What is your last name?");
	    String lastName = kbInput.nextLine();

	    System.out.println("Your full name is " + firstName + " " + lastName + ".");
    }
}
