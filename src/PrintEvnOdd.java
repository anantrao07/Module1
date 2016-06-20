
public class PrintEvnOdd {

	public void printEven(){
		int i = 0;
		int count_even = 0;
		int count_odd= 0;
		
		
		while(count_even < 10){
				
			
			
			if(i%2==0){
				
				
				System.out.println("even numbers "+ i);
				count_even = count_even+1;
				
			}
			
			i++;
		}
	}
	public void printOdd(){
		int i = 0;
		
		int count_odd= 0;
		
		
		while(count_odd < 10){
				
			
			
			if(i%2 != 0){
				
				
				System.out.println("odd numbers.. "+ i);
				count_odd = count_odd+1;
				
			}
			
			i++;
			
		}
	}
	
	public void usingWhileOdd(){
		int count_odd = 0;
		int i = 0;
			do{
				if(i%2 != 0){
					
					
					System.out.println("odd numbers.. "+ i);
					count_odd = count_odd+1;
					
				}
				i++;
			}while(count_odd < 10);
	}
	
	public void usingWhileEven(){
		int count_even = 0;
		int i = 0;
			do{
				if(i%2 == 0){
					
					
					System.out.println("even numbers.. "+ i);
					count_even = count_even+1;
					
				}
				i++;
			}while(count_even < 10);
	}
	public static void main(String[] args) {
		
		PrintEvnOdd p = new PrintEvnOdd();
		p.printEven();
		System.out.println("\n");
		p.printOdd();
		System.out.println("Using while even numbers : ");
		p.usingWhileEven();
		System.out.println("Using while odd numbers : ");
		p.usingWhileOdd();
		
		
	}

}
