import static org.junit.Assert.*;

import org.junit.Test;

public class JuTest_1_5_Recursion {

	@Test
	public void testMinIndex1() {
		 double[] a1 = {3.0 };
		 assertEquals(0, Exercise_1_5_Recursion.minIndex(a1, 0, a1.length-1));
	}
	
	@Test
	public void testMinIndex2() {
		 double[] a2 = {3.0, 2.0, 5.0, 1.0, 8.0 };
		 assertEquals(3, Exercise_1_5_Recursion.minIndex(a2, 0, a2.length-1));

		 assertEquals(1, Exercise_1_5_Recursion.minIndex(a2, 0, 2));
	}
	
	@Test
	public void testMinIndex3() {	
		 double[] a3 = { 1.0, 3.0, 2.0, 5.0, 4.0 };
		 assertEquals(0, Exercise_1_5_Recursion.minIndex(a3, 0, a3.length-1));
	
	}
	public static final double EPSILON = 0.0;  // Ungenauigkeitsschranke f�r Gleichheitsvergleich
	
	@Test
	public void testSelectionSort() {
		 double[] arr = {3.0, 2.0, 5.0, 1.0, 8.0 };
			
		 Exercise_1_5_Recursion.selectionSort(arr, 0, arr.length-1);
		 
		 assertEquals(1.0, arr[0], EPSILON);
		 assertEquals(2.0, arr[1], EPSILON);
		 assertEquals(3.0, arr[2], EPSILON);
		 assertEquals(5.0, arr[3], EPSILON);
		 assertEquals(8.0, arr[4], EPSILON);
		 
	}
}
