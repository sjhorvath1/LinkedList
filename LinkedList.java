
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
			return; 
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
	
	public T removeFirst(){
		T returnElement = (T) head.getData();
		if(numObjects == 0){
			return null;
		}
		else if(numObjects ==1){
			head = tail = null;
		}
		else{
			head = head.getNext();
		}
		numObjects --;
		return returnElement;
		
	}
	
	public T removeLast(){
		T returnElement = (T) tail.getData();
		if(numObjects == 0){
			return null;
		}
		else if(numObjects == 1){
			head = tail = null;
		}
		else{
			Node<T> currentNode = head;
			Node<T> prevNode = null;
			
			while(currentNode.getNext() != null){
				prevNode = currentNode;
				currentNode = currentNode.getNext();	
			}
			tail = prevNode;
			prevNode.setNext(null);
			numObjects --;
		}
		return returnElement;
	}
		
	@Override
	public T remove(int givenPosition) {
		T returnElement = null;
	
		if(numObjects == 0){
			System.out.println("Empty list!");
			return returnElement;
		}
		
		else if(numObjects == 1){
			returnElement = (T) head.getData();
			head = tail = null;
			numObjects --;
		}
		else if(givenPosition == 1){
			removeFirst();
		}
		
		else{
			Node currentNode = head;
			Node prevNode = null;
			int traverseCount = 0 ;
			while(traverseCount < numObjects){
				prevNode = currentNode;
				currentNode = currentNode.getNext();
				traverseCount++;
				if(traverseCount == givenPosition - 1){
					prevNode.setNext(currentNode.getNext());
					returnElement = (T) currentNode.getData();
				}
			}
				
		}
		
		return returnElement;
	}

	@Override
	public void clear() {
		head = tail = null;
		numObjects = 0;
		
	}

	@Override
	public void replace(int givenPosition, T newEntry) {
		Node addNode = new Node(newEntry);
		Node prevNode = null;
		Node currentNode = head;
		int traverseCount = 0;
		if(givenPosition == 1){
			addNode.setNext(head.getNext());
			head = addNode;
		}
		while(traverseCount < numObjects){
			prevNode = currentNode;
			currentNode = currentNode.getNext();
			traverseCount++;
			if(traverseCount == givenPosition - 1){
				addNode.setNext(currentNode.getNext());
				prevNode.setNext(addNode);
			}
		}
		
	}

	@Override
	public T getEntry(int givenPosition) {
		T returnElement = null;
		Node currentNode = head;
		int traverseCounter = 0;
		while(traverseCounter < numObjects){
			if(traverseCounter == givenPosition - 1){
				return returnElement = (T)currentNode.getData();
			}
			currentNode = currentNode.getNext();
			traverseCounter++;
		}
		return returnElement;
	}

	@Override
	public boolean contains(T anEntry) {
		int traverseCounter = 0;
		Node currentNode = head;
		if(head.getData() == anEntry){
			return true;
		}
		else{
			while(traverseCounter < numObjects - 1){
				currentNode = currentNode.getNext();
				if(currentNode.getData() == anEntry){
					return true;
				}
				traverseCounter++;
			}
		}
		return false;
	}

	@Override
	public int getLength() {
		return numObjects;
	}

	@Override
	public boolean isEmpty() {
		if(numObjects == 0){
			return true;
		}
		else{
			return false;
		}
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
