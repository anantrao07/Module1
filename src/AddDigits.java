import java.util.Scanner;


public class AddDigits {

	int sum = 0 ;
	int sum1 = 0 ; 
	int sum2 = 0;
	public void addDigits(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number , well add up its digit");
		int number = sc.nextInt();
		int numberfor = number ;
		int numberdowhile = number;
		int div = 10;
		int count = 0;
		
		
			
		
		while(number > 0){
			int divider;
		
		
		int remainder = number % 10;
		number = number/10;
		
		sum = sum+remainder;
		
		
		}
		System.out.println("sum is "+ sum);
		
		System.out.println("using do while loop ");
		
		do{
			int divider;
			
			
			int remainder = numberdowhile % 10;
			numberdowhile = numberdowhile/10;
			
			sum2= sum2+remainder;
		}while(numberdowhile > 0);
		System.out.println("From do while loop "+ sum2);
		
		for(int i =  numberfor ; i >0; i++){
			int remainder1 = numberfor % 10;
			numberfor = numberfor/10;
			
			sum1 = sum+remainder1;
			//Please tell me why the for loop is slow.
			}
			System.out.println("from for loop : sum is "+ sum1);
	
		
	}
	
	public static void main(String[] args) {
		
		AddDigits ad = new AddDigits();
		ad.addDigits();
		

	}

}
