import java.util.Scanner;

public class TaskOne {

public static void main(String...args){

	Scanner input = new  Scanner(System.in);

	System.out.print("Enter the validate number: ");

	String validateNumber = input.nextLine(); 

	if (validateNumber.charAt(0)=='4'||validateNumber.charAt(0)=='5'|| validateNumber.charAt(0)=='6') {

		System.out.print(validateNumber.charAt(0));
		
		System.out.print(validateNumber.charAt(1));

		System.out.print(validateNumber.charAt(2));

		System.out.print(validateNumber.charAt(3) + "-");

		System.out.print(validateNumber.charAt(4));

		System.out.print(validateNumber.charAt(5));

		System.out.print(validateNumber.charAt(6));
		
		System.out.print(validateNumber.charAt(7) + "-");

		System.out.print(validateNumber.charAt(8));

		System.out.print(validateNumber.charAt(9));

		System.out.print(validateNumber.charAt(10));

		System.out.print(validateNumber.charAt(11) + "-");

		System.out.print(validateNumber.charAt(12));

		System.out.print(validateNumber.charAt(13));

		System.out.print(validateNumber.charAt(14));

		System.out.print(validateNumber.charAt(15));


	}


	

}


}