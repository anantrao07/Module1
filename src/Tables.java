
public class Tables {

	//assuming the question says it needs a table of 10. 
	public void tablesofTen(){
		
		System.out.println("using for loop ");
		for(int i = 0 ; i<=10 ; i++){
			
			System.out.println("10 X "+ i + " = "+ 10*i);
			
		}
		int i = 0;
		System.out.println("using while loop \n");
		while(i<=10){
			
			System.out.println("10 X "+ i + " = "+ 10*i);
			i = i+1;
		}
		int j = 0;
		System.out.println("Using do while loop");
		do{
			
			System.out.println("10 X "+ j + " = "+ 10*j);
			j = j+1;
		}while(j<=10);
	}
	
	
	public static void main(String[] args) {
		Tables t =new Tables();
		t.tablesofTen();

	}

}
