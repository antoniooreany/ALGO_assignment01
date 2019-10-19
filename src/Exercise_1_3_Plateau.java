import java.util.Arrays;
import java.util.Random;

public class Exercise_1_3_Plateau {

	/** computes the length of the longest plateau in array a
	 *  A plateau is a sequence of indices containing the same value
	 *  
	 *    @param a  sorted array
	 *    @return   length of the longest plateau
	 */
	public static int plateauLength(int[] a) {
		//TODO
		//TODO		
		//TODO
		//TODO
		//TODO
		return -1; //TODO
	}
	

	public static final int MAX_LEN = 100000000;
	/** some simple tests */
	public static void main(String[] args) {
		int[] f1 = {1, 2, 2, 3, 4, 4, 4, 4, 5, 5, 6 };
		System.out.println("longest plateau in f1: " + plateauLength(f1));
		System.out.println("  expected: 4");
		System.out.println();
		
		int[] f2 = {9, 9, 9, 9, 9, 4, 4, 4, 3, 2, 2, 2, 2 };
		System.out.println("longest plateau in f2: " + plateauLength(f2));
		System.out.println("  expected: 5");
		System.out.println();
		
		int[] f3 = {1, 2, 3, 4, 5, 6 };
		System.out.println("longest plateau in f3: " + plateauLength(f3));
		System.out.println("  expected: 1");
		System.out.println();
		
		int[] f4 = {1, 1, 1, 1};
		System.out.println("longest plateau in f4: " + plateauLength(f4));
		System.out.println("  expected: 4");
		System.out.println();
		
		//generate sortedarray of random values
		Random rnd = new Random(42);
		int[] f5 = new int[MAX_LEN];
		int limit = (int)Math.sqrt(MAX_LEN);
		for (int i = 0; i < f5.length; i++) {
			f5[i] = rnd.nextInt(limit);
		}
		Arrays.sort(f5);
		
		System.out.println("length of array f5:" + f5.length);
		System.out.println("length of longest plateau in f5: " + plateauLength(f5));
		System.out.println();
		
		int[] f6 = {2, 2, 1, 3, 1};
		System.out.println("longest plateau in f6: " + plateauLength(f6));
		System.out.println("  expected: 2");
		System.out.println();
		
		
		System.out.println("- fertig -");
	}

}
