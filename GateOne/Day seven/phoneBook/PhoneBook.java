import java.util.ArrayList;

import java.util.Scanner;

public class PhoneBook {

public static void main(String...args){

	System.out.print("WELCOME TO PHONEBOOK APP");

	String phoneBook = """

	Hi, Welcome

	Press""";

	String prompt = """

	1-> For Add contact

	2-> For Remove contact

	3-> For Find contact by phone number

	4-> For Find contact by first name 

	5-> For Find contact by last name 

	6-> For Edit contact

	""";

	ArrayList<String> myPhoneBook = new ArrayList<>();

	


	System.out.println(phoneBook);

	System.out.println(prompt);

	Scanner input = new Scanner(System.in);

	int userInput = input.nextInt();

	
	switch(userInput){
	
	case 1: System.out.println("Add contact");

	break;

	case 2: System.out.println("Remove contact");

	break;

	case 3: System.out.println("Contact by first name");

	break;

	case 4: System.out.println("Contact by last name");

	break;

	case 5: System.out.print("Edit contact");

	break;

	default: System.out.println("You're blessed");


	}


	
}

}