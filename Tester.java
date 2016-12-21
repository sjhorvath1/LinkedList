import com.sun.org.apache.bcel.internal.generic.L2D;

public class Tester {

	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		System.out.println(list);
		list.add("Bob");
		list.add("Tony");
		list.add("Jim");
		list.add("Ian");
		list.add("Kendrick");
		System.out.println(list);
		System.out.println(list.getEntry(2));
		//System.out.println(list);
	
	}
	

}
