import com.sun.org.apache.bcel.internal.generic.L2D;

public class Tester {

	public static void main(String[] args){
		LinkedList<String> l1 = new LinkedList<String>();
		System.out.println(l1);
		l1.add("Bob");
		System.out.println(l1);
		l1.add(1, "Sam");
		System.out.println(l1);
	}

}
