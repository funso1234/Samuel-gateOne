import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class MenstrualCycle {

public static void main(String...args) {

	Scanner input = new Scanner(System.in);

	LocalDate now = LocalDate.now();

	
	System.out.println("Enter the first day of menstrual flow (yyyy-mm-dd): ");
	String firstDay = input.nextLine();

	System.out.println("Enter your last day of menstrual flow (yyyy-mm-dd): ");
	String lastDay = input.nextLine();

	LocalDate lastDateOfFlow = LocalDate.parse(lastDay, DateTimeFormatter.ofPattern("yyyy-mm-dd"));

	System.out.println("Enter the day of your menstrual flow: "); 
	int daysOfMenstrualFlow = input.nextInt();

        System.out.print("Enter the average menstrual cycle length in days: ");
	int cycleLength = input.nextInt();


	LocalDate today = LocalDate.now();

        LocalDate lastDate = LocalDate.parse(input.nextLine());

        LocalDate nextMenstrualFlow = lastDate.plusDays(cycleLength);

        LocalDate ovulationDate = lastDate.plusDays(cycleLength);


	
}

}