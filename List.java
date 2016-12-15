
public interface List<T> {
	
	/**
	 * Adds a new entry to the list. 
	 * @param newEntry - Entry to add to the list.
	 */
	public void add(T newEntry);
	
	/**
	 * Adds a new entry to a position in the list.
	 * @param newPosition - Position in list to add the object.
	 * @param newEntry - Object to add to the list.
	 */
	public void add(int newPosition, T newEntry);
	
	/**
	 * Removes an element from the given position in the list.
	 * @param givenPosition - Position in list to remove from.
	 * @return The removed element.
	 */
	public T remove(int givenPosition);
	
	/**
	 * Clears all data from the list.
	 */
	public void clear();
	
	/**
	 * Replaces the element in the list at the given position with the given entry.
	 * @param givenPosition - Position in list to replace element.
	 * @param newEntry - Element to replace with.
	 */
	public void replace(int givenPosition, T newEntry);
	
	/**
	 * Returns the entry at a given position in the list.
	 * @param givenPosition Position to return the entry from.
	 * @return An entry in the list from the given position.
	 */
	public T getEntry(int givenPosition);
	
	/**
	 * Checks whether a given entry is contained in the list.
	 * @param anEntry Entry to search for in list.
	 * @return True if entry is found, false if not.
	 */
	public boolean contains(T anEntry);
	
	/**
	 * Returns the length of the list.
	 * @return Length of list.
	 */
	public int getLength();
	
	/**
	 * Tells us whether or not the list is empty.
	 * @return True if empty, false if not.
	 */
	public boolean isEmpty();
	
	/**
	 * Returns an array representation of the list.
	 * @return An array of all the objects in the list.
	 */
	public T[] toArray();
	
	
}
