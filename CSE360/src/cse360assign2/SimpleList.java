package cse360assign2;

/**Derek Shi
*346
*Assignment 1
*This is a file that creates an array and performs a few operations
*on said array
*/

/**This class represents a simple list with a variety of functions.
 */

public class SimpleList {
	/**
	 * This is the array.
	 */
	private int[] list;
	/**
	 * This integer keeps track of the number of elements in the array.
	 */
	private int count;
	
	/**
	 * This constructor initializes an array and sets the count to 0;
	 */
	public SimpleList()
	{
		list = new int[10];
		count = 0;
	}
	
	/**This methods adds an integer to the front of an array
	 *It increments count, and pushes all elements one to the right
	 */
	public void add(int toBeAdded)
	{
		for (int i = 9; i > 0 ; i-- )
		{
			list[i] = list[i-1];
		}
		//pushes every element in array 1 location over
		
		list[0] = toBeAdded;
		//sets element 0 to the toBeAdded integer.
		if(count < 10)
		{
			count++;
		}
		//increments count if the array is not full
	}
	
	/** This method removes the first integer found with the same value 
	 * as the input. Then it slides all of the other array values one 
	 *  to the left.
	 */
	public void remove(int ToBeRemoved)
	{
		boolean foundTarget = false;
		
		for (int i = 0; i < count; i++ )
		{
			if(list[i] == ToBeRemoved && foundTarget == false)
			{
				for (int j = i; j < 9; j++)
				{
					list[j] = list[j+1];
				}
				//slides every element on the right one to the left,
				//overriding the element that is to be removed
				
				if(count > 0)
				{
					count--;
				}
				//decrements count if array is 0;
				foundTarget = true;
			}
		}
	}
	
	/** This method returns the count
	 */
	public int count()
	{
		return count;
	}
	
	/**This method outputs the array in the form of an appended
	 * string. It does not output trailing zeros, and does not
	 * have a space (whitespace) at the end.
	 */
	public String toString()
	{
		String outputString = "";
		
		for (int i = 0; i < count; i++)
		{
			outputString = outputString + list[i];
			//appends each element;
			if (i < count-1)
			{
				outputString = outputString + " ";
				//adds spaces as needed;
			}
		}
		
		return outputString;
	}
	
	/** This method finds the first element with the same value as the
	 *  input integer. It returns the index. If something is not found,
	 * then it returns -1.
	 * 
	 */
	public int search(int lookup)
	{
		int index = -1;
		boolean found = false;
		//default of not finding it.
		
		for (int i = 0; i < count; i++)
		{
			if(list[i] == lookup && found == false )
			{
				index = i;
				found = true;
				//sets the output to the index of where it was found.
			}
		}
		return index;
	}

}
