import com.sun.org.apache.bcel.internal.generic.L2D;

public class Tester {

	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		System.out.println(list);
		list.add("Bob");
		System.out.println(list);
		list.add(2, "Sam");
		System.out.println(list);
		list.add(3,"Jim");
		list.add(4,"Tony");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);

	}

}
