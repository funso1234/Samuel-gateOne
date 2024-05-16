import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class SemicolonMall2{

public static void main(String[] args){

	Scanner input = new Scanner(System.in);
 
	int counter = 0;
	
	ArrayList<String> item = new ArrayList<String>();
	ArrayList<Integer> quantity = new ArrayList<Integer>();
	ArrayList<Integer> price = new ArrayList<Integer>();
	ArrayList<Double> sum = new ArrayList<Double>();

	System.out.println("What Is The Customer's Name");
	String customerName = input.nextLine();
	double subTotal = 0;
	String moreItems = null;

	Date date = new Date();

	do{

		System.out.println("What Did The User Buy?");
		String userBuy = input.nextLine();

		System.out.println("How Many Pieces?");;
		int pieces = input.nextInt();

		System.out.println("How Much Per Unit?");
		int perUnit = input.nextInt();
		
		double total = pieces * perUnit;

		item.add(userBuy);
		quantity.add(pieces);
		price.add(perUnit);
		sum.add(total);

		System.out.println("Add More Items?");
		moreItems = input.nextLine();

		input.nextLine();
		if (moreItems.equals("no")) {	
		}
		
		}while(moreItems.equals("yes"));
	System.out.println("What Is The Cashier's Name?"); 
	String cashierName = input.nextLine();

	System.out.println("How Much Discount Will He Get");
	int costDiscount = input.nextInt();

	System.out.println("How much did he pay? ");
	double amountPaid = input.nextDouble();
	
	System.out.println("=====================================================");
	System.out.println("ITEM        QTY         PRICE           TOTAL(NGN)");
	System.out.println("-----------------------------------------------------");


	for (counter = 0; counter < item.size(); counter++) {
	System.out.println(item.get(counter) + "\t" + quantity.get(counter) + "\t" + price.get(counter) + "\t" + sum.get(counter));
	subTotal += sum.get(counter);

	}

        double discount = costDiscount * subTotal / 100;

	double vat = 17.50 / 100 * subTotal;
	double billTotal = subTotal + discount + vat;
	double balance = amountPaid - billTotal;

	System.out.println("=====================================================");

	System.out.printf("Sub Total: %.2f%n", subTotal);	

	System.out.printf("Discount: %.2f%n", discount);

	System.out.printf("VAT @17.50: %.2f%n", vat);
	System.out.println("=====================================================");

	System.out.printf("Bil Total:     \t%.2f%n", billTotal);
	
	System.out.printf("Amount paid:  \t%.2f%n",amountPaid);

	System.out.printf("Balance:     \t%.2f%n", balance);

	System.out.println("=====================================================");
	
	System.out.println("THANK YOU FOR YOUR PATRONAGE");

	System.out.println("=====================================================");	

	




	




}

}