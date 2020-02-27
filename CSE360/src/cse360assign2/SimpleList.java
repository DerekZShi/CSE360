package cse360assign2;

/**Derek Shi
*346
*Assignment 1
*This is a file that creates an array and performs a few operations
*on	 said array
*/

/**This class represents a simple list with a variety of functions.
 */

public class SimpleList {
	/**
	 * This is the array.
	 */
	private int[] list;
	
	/**
	 * This is the temporary array which holds the values of the elements
	 * in the array while the array is increasing or decreasing in size
	 */
	
	private int[] temp;
	
	
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
		if (count == list.length)
		{
			temp = new int[list.length];
			
			for (int i = 0; i < list.length; i++)
			{
				temp[i] = list [i];
			}
			
			list = new int[(int) (list.length * 1.5)];
			
			for (int i = 0; i < list.length * 2/3; i++)
			{
				list[i] = temp[i];
			}
			
		}
		for (int i = list.length-1; i > 0 ; i-- )
		{
			list[i] = list[i-1];
		}
		//pushes every element in array 1 location over
		
		list[0] = toBeAdded;
		//sets element 0 to the toBeAdded integer.
		
		count++;
		
		//increments count if the array is not full
	}
	
	public void append(int toBeAppended)
	{
		if (count == list.length)
		{
			temp = new int[list.length];
			
			for (int i = 0; i < list.length; i++)
			{
				temp[i] = list [i];
			}
			
			list = new int[(int) (list.length * 1.5)];
			
			for (int i = 0; i < list.length * 2/3; i++)
			{
				list[i] = temp[i];
			}
		}
		list[count] = toBeAppended;
		
		count++;
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
				for (int j = i; j < list.length-1; j++)
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
			
			
			if (count < list.length * 3/4 && list.length > 1)
			{
				temp = new int[list.length];
				
				for (int k = 0; k < count; k++)
				{
					temp[k] = list[k];
				}
				
				
				list = new int[(int) (list.length * 3/4)];
				
				
				for (int k = 0; k < count; k++)
				{
					list[k] = temp[k];
				}
				
			}
		}
	}
	
	/** This method returns the count
	 */
	public int count()
	{
		return count;
	}
	
	/** This method returns the count
	 */
	public int size()
	{
		return list.length;
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
	
	public int first()
	{
		int firstElement = -1;
		
		if (count > 0)
		{
			firstElement = list[0];
		}
		
		return firstElement;
	}
	
	public int last()
	{
		int lastElement = -1;
		
		if (count > 0)
		{
			lastElement = list[count-1];
		}
		
		return lastElement;
	}

}
