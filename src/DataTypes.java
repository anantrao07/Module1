import java.util.Scanner;


public class DataTypes {

	byte bx = 100 ;
	short sx = 1000;
	int ix = 10000;
	long lx = 123456789;
	double dx = 54.5d;
	float fx =  15.5f;
	char cx = 'a';
	//boolean box;
	

	public void dataTypeOps(){
		System.out.println("performing addition on byte and short "+bx+ sx);
		System.out.println("performing subtraction integer and long "+(ix - lx));
		System.out.println("performing multipliation on double and byte"+(dx * bx));
		System.out.println("performing division on float  "+(fx / 5));
		System.out.println("performing increment  float"+ ++fx);
		System.out.println("performing decrement char "+ --cx);
		System.out.println(bx);
	}
	public void performOperation(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to perform arithmetic operation on all data types");
		System.out.println("Press 2 to perform all the given arithmetic operation");
		try{
		int i = sc.nextInt();
		switch(i){
		
		case 1:
			dataTypeOps();
			break;
		
		case 2 :
			allOps();
				break;
				
		default:
			System.out.println("nothing selected");
		}
		
	
		}
		catch(Exception e){
			System.out.println("Did not enter an integer");
			
		}
	}
	
	
	public void allOps() {
		
		System.out.println("Performing all the operation ");
		System.out.println("performing addition on byte and short "+bx+ sx);
		System.out.println("performing subtraction integer and long "+(ix - lx));
		System.out.println("performing multipliation on double and byte"+(dx * bx));
		System.out.println("performing division on float  "+(fx / 5));
		System.out.println("performing increment  float"+ ++fx);
		System.out.println("performing decrement char "+ --cx);
		System.out.println(bx);
	}
	
	
	public static void main(String[] args) {
		
		DataTypes dt = new DataTypes();
		dt.performOperation();
	}

}
