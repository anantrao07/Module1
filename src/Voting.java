import java.util.Scanner;


public class Voting {

	public void isEligible(){
		
		System.out.println("Please enter your age");
	Scanner s = new Scanner(System.in);
	int i = s.nextInt();
	
	if (i<18 ){
		System.out.println("Sorry kiddo you are not eligible for voting");
		
	}
	if(i>=18){
		System.out.println("Congrats , make your vote count and change the world");
		
	}
	
	
	}
	
	public static void main(String[] args) {
		
		Voting v  = new Voting();
		v.isEligible();
		
	}

}
