package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**Derek Shi
*346
*Assignment 1
*This file tests the SimpleList, by checking each method in a variety
*of ways.
*/

class SimpleListTest {
	

	/**
	 *  ZEROS TEST. THE PREDICTION IS KEY!
	 */
	@Test
	void testUsingZerosForAnything() {
		SimpleList test = new SimpleList();
		test.add(0);
		test.add(0);
		test.search(0);
		test.remove(0);
		assertTrue(test.toString().equals("0"));
	}
	
	@Test
	void testNewAdd()
	{
		SimpleList test = new SimpleList();
		test.add(0);
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10); test.add(11); test.add(12); test.add(13); test.add(14); test.add(15);
		//System.out.println(test.count());
		//System.out.println(test.sizeOfArray());
		//System.out.println(test.toString());
	}
	
	@Test
	void testNewRemove()
	{
		SimpleList test = new SimpleList();
		test.add(0);
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(3);
		test.remove(5);
		test.add(5);
		test.remove(5);
		test.remove(3);
		test.remove(4);
		test.remove(3);
		test.remove(2);
		test.remove(1);
		test.remove(0);
		System.out.println(test.count());
		System.out.println(test.sizeOfArray());
		System.out.println(test.toString());
	}
	

	

}
