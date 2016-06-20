import java.util.Scanner;


public class Greatest {

	public void greater(int a, int b ){
		
		if(a > b){
			System.out.println("Greater number is "+a);
		
		}
		else if(a ==b){
			System.out.println("None of the two numbers is greater");
		}
		else  { 
			System.out.println("Greater number is "+ b);
		}
	}
	public static void main(String[] args) {
		
		
		try{
			System.out.println("We are comparing two values to find which one is greater \n Enter the first number");
			Scanner s = new Scanner(System.in);
			int i = s.nextInt();
			System.out.println("Enter second number");
			int j = s.nextInt();
			Greatest g = new Greatest();
			g.greater(i, j);
		}
		catch(Exception e){
			System.out.println("opps something went wrong!!, probably incorrect number or no number was entered");
		}
	}

}
