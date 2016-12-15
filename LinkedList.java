
public class LinkedList<T> implements List<T> {
	private Node head;
	private Node tail;
	private int numObjects;
	
	public LinkedList() {
		super();
		head = null;
		tail = null;
		numObjects = 0;
	}
	
	@Override
	public void add(T newEntry) {
		Node<T> n1 = new Node<T>(newEntry);
		if((head == null) && (tail == null)) {
			head = tail = n1;
			numObjects++;
		}
		else{
			tail.next = n1;
			tail = n1;
			numObjects++;
		}
	}

	@Override
public void add(int newPosition, T newEntry) {
		
		Node<T> n1 = new Node<T>(newEntry);
		int count = 1;
		
		if(newPosition <= 0){
			break; 
		}
		
		//Adding to end of list (but not over the number of
		//objects by anything other than 1)
		if ((numObjects ==0) && (newPosition == 1))
		{
			head = n1;
			tail = n1;
			numObjects++;
		}
		else if ((newPosition-1) == numObjects)
		{
			tail.next = n1;
			tail = n1;
			numObjects++;
		}
		//Empty list and newPosition is 1
		
		else if (newPosition == 1)
		{
			n1.next = head;
			head = n1;
			numObjects++;
		}
		
		else
		{
			
			for (Node it = head; it != null; it = it.next)
			{
				if (count == (newPosition-1))
				{
					n1.next = it.next;
					it.next = n1;
					numObjects++;
					break;
				}
				count++;
			}
		}
		
	}

	@Override
	public T remove(int givenPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void replace(int givenPosition, T newEntry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getEntry(int givenPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
		
	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}

	private class Node<T>{
		private T data;
		private Node next;
		
		public Node(T data){
			super();
			this.data = data;
			this.next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		
		
		
	}

}
