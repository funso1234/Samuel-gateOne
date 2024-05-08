import java.util.Arrays;
import java.util.Scanner;
public class TaskTwo {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int[] num = new int[10];

	for (int counter = 0; counter < 10; counter++) {

	System.out.println("Enter the score: ");
	
	int score = input.nextInt();
 	
	num[counter] = score;
	}

	for (int counter = 0; counter < 10; counter++){
	System.out.print(num[counter]);
	}
}
}