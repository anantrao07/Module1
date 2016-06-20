import java.util.Scanner;


public class Sign {

	public void checkSign(){
		
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i<0){
			System.out.println("the sign of number is negetive");
		}
		if(i>0){
			System.out.println("the sign of number is positive");
		}
		else if (i == 0){
			System.out.println("the number is 0");
		}
	}
	public static void main(String[] args) {
		
		Sign s = new Sign();
		s.checkSign();
	}

}
