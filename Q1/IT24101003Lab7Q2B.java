import java.util.Scanner;

public class IT24101003Lab7Q2B{
	
	public static void main(String []args){
		int count = 1;
		int total=0;
		float avg = 0;
		Scanner scanner = new Scanner(System.in);
		while(count <=3){
			total =0;
			System.out.println("Student " + count);
			System.out.print("Enter subject Marks: ");
			String marksStr = scanner.nextLine();
			String[] tempMarks = marksStr.split(" ");
			for(int i =0; i<4; i++){
				total+= Integer.parseInt(tempMarks[i]);
				
			}
			avg =total/4;
			 System.out.println("Average is " + avg);
		   if(avg<=100 && avg >= 75){
			   System.out.println("overall grade is Distinction");
			   System.out.println("");
		   }else if(avg<75 && avg >= 50){
			   System.out.println("overall grade is Credit");
			    System.out.println("");
		   }else{
			   System.out.println("overall grade is Fail");
			    System.out.println("");
		   }
			count++;
		}
		  
		
		
		
	}
} 
