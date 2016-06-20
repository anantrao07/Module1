import java.util.ArrayList;

public class ChangeTest {

    private int myValue = 0;
    
    public void showOne(int myValue){
        myValue = myValue;
    }
    
    public void showTwo(int myValue){
        this.myValue = myValue;
    }    
    public  static void main(String[] args) {
        ChangeTest ct = new ChangeTest();
        ct.showTwo(200);
        System.out.println(ct.myValue);
        ct.showOne(100);
        char c = 'b';
        System.out.println((int )c);
        char[] b = { 'j', 'a', 'v', 'a' };
        String cn = new String(b);
        ArrayList<Integer> arl = new ArrayList<Integer>();
        //arl.subList(fromIndex, toIndex)
        System.out.println(cn);
        int ia[][] = { {1, 2}, null };
   
     }
}
