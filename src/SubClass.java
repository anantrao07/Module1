


public class SubClass extends Super{
	
	int firsti, secondi;
	
	static int i = 0 ; 
	
  public String toString(){
	  this.i = 4;
     return super.toString()+"3";
     
   
  }
  public static void main(String[] args){
    System.out.println( new SubClass() );
    SubClass  sb = new SubClass();
    SubClass  sbw = new SubClass();
    
    sb.firsti = 10 ; 
    sb.secondi = 20;
    sbw.firsti = 30 ; 
    sbw.secondi = 40 ; 
    System.out.println("from first object "+ sb.firsti + "  "+ sb.secondi);
    
    System.out.println("from second object "+ sbw.firsti + "  "+ sbw.secondi);
    
    
  }
}
