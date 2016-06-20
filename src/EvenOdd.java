import java.util.Scanner;


public class EvenOdd {

	public void evenOdd(){
		try{
			System.out.println("We are checking if the given number is even or odd \n Enter the number");
			Scanner s = new Scanner(System.in);
			int i = s.nextInt();
			if(i%2 == 0){
				System.out.println("the number is even ");
			}
			else if(i%2 != 0){
				System.out.println("the number is odd");
			}
			
		}
		catch(Exception e){
			System.out.println("opps something went wrong!!, probably incorrect number or no number was entered");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd  ev = new EvenOdd();
		ev.evenOdd();
	}

}
