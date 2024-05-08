import java.util.Scanner;
public class Task3 {
public static void main(String...args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	int average = 0;
	for (int i =1; i < 11; i++){
	System.out.println("Enter the number: ");
	int number = input.nextInt();
	sum += i;
	average = sum / 10;
	}
	System.out.println(sum);
	System.out.print(average);	

}



}