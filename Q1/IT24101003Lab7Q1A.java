import java.util.Scanner;

public class IT24101003Lab7Q1A{
	
	public static void main(String []args){
		int count = 1;
		int total=0;
		Scanner scanner = new Scanner(System.in);
		while(count <=4){
			System.out.print("Enter subject Mark " + count +": ");
			int mark = scanner.nextInt();
			total += mark;
			count++;
		}
		  
		   float avg = total /4;
	
		   System.out.println("Average is " + avg);
		   if(avg<=100 && avg >= 75){
			   System.out.println("overall grade is Distinction");
		   }else if(avg<75 && avg >= 50){
			   System.out.println("overall grade is Credit");
		   }else{
			   System.out.println("overall grade is Fail");
		   }
		
		
		
		
		
	}
} 
