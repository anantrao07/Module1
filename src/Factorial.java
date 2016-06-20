import java.util.Scanner;


public class Factorial {

	 int factorial;
	public void factorial(int a){
			int fact = a;
			if(a==0){
				System.out.println("factorial of 0 is 1");
			}
			else{
		for(int i = 1 ; i<a ; i++){
			//System.out.println("value of i is "+ i);
			//System.out.println("fact before multiplication "+ fact);
			fact = fact*i;
			//System.out.println("fact after multiplication "+ fact );
				}
			}
			System.out.println("using for loop factorial is "+ fact );
		}
	
	public void factorialUsingWhile(int b){
		int fact = b ;
		
		int i = 1;
		
		while(i<b){
			//System.out.println("value of i is "+ i);
		//	System.out.println("fact before multiplication "+ fact);
			fact = fact*i;
			
			i = i+1;
			
		}
		System.out.println("using while loop : factorial is "+ fact );
	}
	
	public void factorialDoWhile(int a){
		int fact= a;
				int i = 1;
		do{
	fact = fact*i;
			
			i = i+1;
			
		}while(i<a);
		System.out.println("factorial using do while loop "+ fact);
	}
	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		
		Factorial f = new Factorial();
		int number = s.nextInt();
		f.factorial(number);
		f.factorialUsingWhile(number);
		f.factorialDoWhile(number);
		
	}

}
