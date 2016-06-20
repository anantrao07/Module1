
public class Fibonacci {
	int previous= 0 ;
	int first = 0;
	int second = 1;
	public void fibonacci(){
		
		System.out.println("first ten fibonacci number");	
		//int third = 1;
		int a[] = new int[11];	
		int sum = 0;
		for(int i = 0 ; i <=a.length-1 ; i++){
		if(i == 0 ){
			sum = first;
			a[0]= first;
		}
		else if(i ==1 || i ==2){
			//sum =second; 
			a[1] = second;
			a[2] = second;
		}
		else{
		
		
			a[i] = a[i-1] +a[i-2];
			
			
			
		}
			System.out.println(" fibonacci series for  "+i+" "+ a[i]);
		
			
		}
		
	}
	public void dowhile(){
		System.out.println("from do while loop ");
			int a[] = new int[11];
	int i = 0;
		int sum = 0;
		
		do{
			if(i == 0 ){
				sum = first;
				a[0]= first;
			}
			else if(i ==1 || i ==2){
				//sum =second; 
				a[1] = second;
				a[2] = second;
			}
			else{
				
				a[i] = a[i-1] +a[i-2];
				
			}
			System.out.println(" fibonacci series for  "+i+" "+ a[i]);
			i++;
		}while(i<a.length);
	}
	
	public static void main(String[] args) {
		
		Fibonacci f = new Fibonacci();
		f.fibonacci();
		f.dowhile();
		
	}

}
