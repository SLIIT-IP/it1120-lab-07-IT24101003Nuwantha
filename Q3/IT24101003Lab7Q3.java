import java.util.Scanner;

public class IT24101003Lab7Q3{
	
	public static void main(String []args){
	Scanner scanner = new Scanner(System.in);
	int count = 1;
	while(count <=5){
		double finalPrice = 0;
		System.out.println("Customer " + count);
		System.out.print("Enter total bill amount: ");
		double billAmount = scanner.nextDouble();
		System.out.print("Enter mode of payment (C for cash,O for other): ");
		char paymentType = scanner.next().toUpperCase().charAt(0);
	
		if(paymentType == 'C' || paymentType == 'O'){
			if(paymentType == 'C'){
				System.out.println("Discount is :"+billAmount*0.05 );
				finalPrice = billAmount* 0.95;
			}else{
				finalPrice = billAmount;
					System.out.println("No discount applicable");
			}
			System.out.println("Amount to be paid: "+finalPrice);
		}else{
			System.out.println("Payment Mode is Not valid ");
		}
	count++;
	}
	}
		
	}
