import java.util.TreeSet;

public class Exercise_1_8_Strings {

	public static TreeSet<String> generateStrings(char[] chSet, int length) {
		//TODO
		//TODO
		//TODO
		//TODO
		//TODO
		return null; //TODO
	}

	
	
	public static void main(String[] args) {
		char[] characters = { 'A', 'B', 'C', 'D', 'E' };
		int count = 0;
		for (String sequence : generateStrings(characters, 4)) {
			count++;
			System.out.printf("%5d. %s%n", count, sequence);
		}

	}
}
