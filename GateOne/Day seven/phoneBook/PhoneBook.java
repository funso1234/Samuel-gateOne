import java.util.ArrayList;

import java.util.Scanner;

public class PhoneBook {

public static void main(String...args){

	Scanner input = new Scanner(System.in);

	ArrayList<String> myPhoneBook = new ArrayList<>();

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




	System.out.println(phoneBook);
	System.out.println("CHOOSE AN OPTION ");
	System.out.println(prompt);

	

	int userInput = input.nextInt();
	input.nextLine();

	
	switch(userInput){
	
	case 1: System.out.println("Add contact ");
		String addContact = input.nextLine();
		myPhoneBook.add(addContact);

		System.out.println("Enter the number");
		String number = input.nextLine();
		myPhoneBook.add(number);
		
		System.out.println("Successfully saved");
			break;

	case 2: System.out.println("Remove contact");
		String removedContact = input.nextLine();
		myPhoneBook.add(removedContact);

		System.out.println("Delete the contact");
		String deleteContact = input.nextLine();
		myPhoneBook.add(deleteContact);

		System.out.println("Successfully deleted"); 
			break;

	case 3: System.out.println("Contact by first name");
		String  firstName = input.nextLine();
		myPhoneBook.add(firstName);
			break;

	case 4: System.out.println("Contact by last name");

	break;

	case 5: System.out.print("Edit contact");

	break;

	default: System.out.println("You're blessed");


	}


	
}

}