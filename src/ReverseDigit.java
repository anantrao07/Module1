import java.util.Scanner;


public class ReverseDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number we'll reverse it");
		int number = sc.nextInt();
		int numberdowhile = number;
		//int remainder = 0;
		System.out.print("the number is ");
		while(number >0){
		int remainder	 = number % 10;
		
		System.out.print( remainder);
		number = number / 10;
		}
		
		System.out.print(" \n from do while loop ");
		int remainder	  = 0;
		do{
			
			
			remainder = numberdowhile % 10;
			
			System.out.print( remainder);
			numberdowhile = numberdowhile / 10;
		}while(numberdowhile >0);

	}

}
