import java.time.LocalDate;

import java.util.Period;

import java.util.Date;

import java.util.Scanner;

public class MenstrualCycle {

public static void main(String...args) {

	Scanner input = new Scanner(System.in);

	LocalDate now = LocalDate.now();

	
	System.out.println("Enter the first day of menstrual flow (yyyy-mm-dd): ");
	String firstDay = input.nextLine();

	System.out.println("Enter your last day of menstrual flow (yyyy-mm-dd): ");
	String lastDay = input.nextLine();

	System.out.printlm("Enter the day of your menstrual flow: ");
	int daysOfMenstrualFlow = input.nextLine();

        LocalDate lastDate = LocalDate.parse(input.nextLine());

        System.out.print("Enter the average menstrual cycle length in days: ");

        int cycleLength = input.nextInt();

        LocalDate nextMenstrualFlow = lastDate.plusDays(cycleLength);

        LocalDate ovulationDate = lastDate.plusDays(cycleLength / 2);


	
}

}