import java.time.LocalDate;

import java.util.Scanner;

public class MenstrualCycle {

public static void main(String...args) {

	Scanner input = new Scanner(System.in);

	LocalDate now = LocalDate.now();


	System.out.print("Enter your last menstrual flow date (yyyy-mm-dd): ");

        LocalDate lastDate = LocalDate.parse(input.nextLine());

        System.out.print("Enter the average menstrual cycle length in days: ");

        int cycleLength = input.nextInt();

        LocalDate nextMenstrualFlow = lastDate.plusDays(cycleLength);

        LocalDate ovulationDate = lastDate.plusDays(cycleLength / 2);


	
}

}