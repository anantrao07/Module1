import java.util.ArrayList;


public class StringPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s;
		String quote = "Eddie ate Dynamite , good bye eddie";
		System.out.println(quote.replace("good bye" , " tata"));
		
		System.out.println(quote);
		quote   = quote.concat("my new part");
		System.out.println(quote);
		System.out.println(quote.startsWith("Eddie" ));
		StringBuffer sb = new StringBuffer("my world");
		sb.delete(0, 4);
		StringBuilder sbl = new StringBuilder("all is great");
		sbl.delete(0, 4);
		String s2[] = new String[3];
		int i[] = new int[4]; 
		long lng = 45l;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.ensureCapacity(3);
		
	//	STR srt = new STR();
		
		
	}
	public class STR{
		
	}

}
