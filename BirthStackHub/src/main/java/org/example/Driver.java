package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Driver {

	public static final int MAX_MONTH = 12;
	public static final String[] months = {null, "January", "February", "March", "April",
		"May", "June", "July", "August", "September", "October", "November", "December" 
	};
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// Declare an array of linked structures
		@SuppressWarnings("unchecked")
		LinkedStack<Person>[] bday = new LinkedStack[MAX_MONTH+1];
		
		// TODO:  Instantiate the array bday using a for loop.
		//        Each element of bday is a new linked stack.

		for (int i = 1; i <= MAX_MONTH; i++) {
			bday[i] = new LinkedStack<>();
		}
		
		Scanner in = new Scanner(new File("birthdays.txt"));
		
		while (in.hasNext()) {
			int bMonth = in.nextInt();
			int bDay = in.nextInt();
			String name = in.nextLine();
			Person p = new Person(name, bMonth, bDay);

			//TODO:  push this new person on the list in the array associated with
			//       the month he/she was born  (1 line only)

			bday[bMonth].push(p);
		}

		// TODO:  Step through bday - the array of linked stacks. For each non-empty list,
		//        use the LinkedStack toString method to list the names of the
		//        celebrities born in that month

		for (int i = 1; i <= MAX_MONTH; i++) {
			if (!bday[i].isEmpty()) {
				System.out.println(months[i] + " Celebrities:");
				System.out.println(bday[i]);
				System.out.println();
			}
		}


	}

}
