import java.util.ArrayList;

import java.util.Scanner;

public class PhoneBook {

static ArrayList<String> phoneNumber = new ArrayList<>();
static ArrayList<String> firstName = new ArrayList<>();
static ArrayList<String> lastName = new ArrayList<>();
static ArrayList<String> Name = new ArrayList<>();

public static void main(String...args){

	phoneBookApp();

	}


	public static void phoneBookApp(){

	Scanner input = new Scanner(System.in);

	System.out.print("WELCOME TO PHONEBOOK APP");

	String phoneBook = """

	Hi, Welcome

	Press""";
	


	String prompt = """

	1-> For Add contact

	2-> Remove contact

	3-> Find contact by phone number

	4-> Find contact by first name 

	5-> Find contact by last name 

	6-> Edit contact

	7-> Exit

	""";
	

	System.out.println(phoneBook);
	System.out.println("CHOOSE AN OPTION ");
	System.out.println(prompt);

	

	int userInput = input.nextInt();
	input.nextLine();

	switch(userInput){
	
	case 1-> addContact();

	case 2-> removeContact();

		


	}

	}

	static void addContact() {

	Scanner input =  new Scanner(System.in);


	System.out.println("Enter your name: ");
	String Name = input.nextLine();
	firstName.add(Name);

	System.out.println("Enter the number: ");
	String number = input.nextLine();
	phoneNumber.add(number);

		addMoreContact();
   
        }
      
	public static void addMoreContact(){
	
	Scanner input =  new Scanner(System.in);

		
	System.out.println("Do you still want to add more contact(Yes/No)? ");  
	String addMore = input.next();  

	if (addMore .equalsIgnoreCase("yes")){
		addContact();
	}
	else{
		System.out.println("<<<<<<<<<Successfully Saved>>>>>>>>>>>>");
		phoneBookApp();

	}
	}

	
	static void removeContact(){

	Scanner input = new Scanner(System.in);

	String surName;
	String lastName;
	String number;

	System.out.println("Remove contact");

	String removedContact = input.nextLine();

	for(int count = 0; count < firstName.size(); count++){

	surName = firstName.get(count);

	if (surName.equals(removedContact)){

	firstName.remove(surName);

	System.out.println(">>>>>>>>Successfully removed<<<<<<<<<<");
	}

	else{
		System.out.println("Contact not found");
		phoneBookApp();


	} 
	}


		


	
}

}