import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import java.time.temporal.ChronoUnit;
    
import java.util.Scanner;

public class MenstrualCycle {

public static void main(String...args) {

	Scanner input = new Scanner(System.in);

	LocalDate today = LocalDate.now();

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	System.out.println("Enter the start date of menstrual flow (dd/MM/yyyy): ");
	String firstDay = input.nextLine();

	System.out.println("Enter the last date of your previous menstrual flow (dd/MM/yyyy): ");
	String lastDay = input.nextLine();
         
        LocalDate start = LocalDate.parse(firstDay,formatter);
	LocalDate end = LocalDate.parse(lastDay,formatter);

        System.out.print("Enter the average menstrual cycle length in days: ");
	int cycleLength = input.nextInt();

        int lengthToOvulation = cycleLength / 2;

        LocalDate nextMenstrualFlow = start.plusDays(cycleLength);

        LocalDate ovulationDate = start.plusDays(lengthToOvulation);

        LocalDate lengthFertilityTime = start.plusDays(9);

	LocalDate safetimer = end.minusDays(4);

        LocalDate safetime = ovulationDate.plusDays(5);

        System.out.println("Your Expected Ovulation Date is "  + ovulationDate);

        System.out.println("Your Expected Fertility Period is " + lengthFertilityTime + " to " + ovulationDate);

        System.out.println("Your safe period is " + safetime + " to " + safetimer);
	
}

}