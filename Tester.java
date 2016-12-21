import com.sun.org.apache.bcel.internal.generic.L2D;

public class Tester {

	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		System.out.println(list);
		list.add("Bob");
		list.add("Tony");
		System.out.println(list);
		list.replace(2, "Sam");
		System.out.println(list);
	
	}
	

}
