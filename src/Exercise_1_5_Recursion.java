import java.util.Arrays;

public class Exercise_1_5_Recursion {

	/**
	 * returns the position of the minimum value of subarray arr[startIndex .. endIndex]
	 */
	
	public static int minIndex(double[] arr, int startIndex, int endIndex) {
		//TODO
		//TODO
		//TODO
		//TODO
		//TODO
		return -1;
	}

	
 
	
	public static void selectionSort(double[] arr, int startIndex, int endIndex) {
		//TODO
		//TODO
		//TODO
		//TODO
	}
	

	public static void selectionSort(double[] arr) {
		selectionSort(arr, 0, arr.length - 1);
	}
	
	public static void swap(double[] arr, int i, int j) {
		double tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	
	public static void main(String[] args) {
		double[] a1 = {5, 3,4,2,7,1,8 };
		selectionSort(a1);
		System.out.println("a1 sorted: " + Arrays.toString(a1));
		
		double[] a2 = new double[50];
		for (int i = 0; i < a2.length; i++) {
			a2[i] = 100*Math.random();
		}
		
		selectionSort(a2);
		System.out.println("a2 sorted: " + Arrays.toString(a2));
		
	}
	

	
}
