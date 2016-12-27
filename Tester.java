import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
	
		@Test
		//Tests the creation of a list
		public void testList(){
			LinkedList<String> list = new LinkedList<String>();
			assertTrue(list.isEmpty());
			
		}
		
		@Test
		//Tests the add function
		public void testAdd(){
			LinkedList<String> list = new LinkedList<String>();
			list.add("Sam");
			assertFalse(list.isEmpty());
		}
		
		@Test
		//Tests the other add function
		public void testAdd1(){
			LinkedList<String> list = new LinkedList<String>();
			list.add("Sam");
			list.add("Tony");
			list.add("Jake");
			list.add(2,"Niles");
			assertEquals("Niles",list.getEntry(2));
		}
		
		@Test
		//Tests the remove function
		public void testRemove(){
			LinkedList<String> list = new LinkedList<String>();
			list.add("Sam");
			list.remove(1);
			assertTrue(list.isEmpty());
		}
		
		@Test
		//Tests the remove function
		public void testRemove1(){
			LinkedList<String> list = new LinkedList<String>();
			list.add("Sam");
			list.add("Tony");
			list.add("Jim");
			list.remove(1);
			assertFalse(list.isEmpty());
			assertEquals(2,list.getLength());
		}
		
		@Test
		//Tests the clear function
		public void testClear(){
			LinkedList<String> list = new LinkedList<String>();
			list.add("Sam");
			list.add("Jim");
			list.add("Tony");
			list.clear();
			assertTrue(list.isEmpty());
		}
		
		@Test
		//Tests the replace function
		public void testReplace(){
			LinkedList<String> list = new LinkedList<String>();
			list.add("Sam");
			list.add("Jim");
			list.add("Tony");
			list.replace(2,"JimBob");
			assertEquals("JimBob",list.getEntry(2));
		}
		
		
		@Test
		//Tests the getEntry function
		public void testGetEntry(){
			LinkedList<String> list = new LinkedList<String>();
			list.add("Sam");
			list.add("Tony");
			list.add("Jake");
			assertEquals("Tony",list.getEntry(2));
		}
		
		@Test
		//Tests the contains function
		public void testContains(){
			LinkedList<String> list = new LinkedList<String>();
			list.add("Sam");
			assertTrue(list.contains("Sam"));
		}
	
		@Test
		//Tests the getLength function
		public void testGetLength(){
			LinkedList<String> list = new LinkedList<String>();
			list.add("Sam");
			list.add("Jonas");
			list.add("Spock");
			list.add("Captain Kirk");
			assertEquals(4,list.getLength());
		}
		
		@Test
		//Tests the isEmpty function
		public void testIsEmpty(){
			LinkedList<String> list = new LinkedList<String>();
			list.add("Sam");
			assertFalse(list.isEmpty());
		}
		
		@Test
		//Tests the isEmpty function
		public void testIsEmpty2(){
			LinkedList<String> list = new LinkedList<String>();
			assertTrue(list.isEmpty());
		}
		

}
	


