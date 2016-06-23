package ArraysAndStrings;

public class PalindromeChecker {
	public boolean isPalindromePermutation(String input){
		int[] array = new int[(int)'z' - (int)'a' +1];
		int oddCounter = 0, offset = (int)'a';
		input.toLowerCase().replaceAll(" ", "");
		for(int i=0; i<input.length(); i++){
			int shift = (int) input.charAt(i) - offset;
			array[shift]++;
			if(array[shift]%2!=0){oddCounter++;}
			else{oddCounter--;}
		}
		return oddCounter<=1;
	}
	
	public boolean isPalindromePermutationBitVector(String input){
		int vector = 0, offset = (int)'a';
		input.toLowerCase().replaceAll(" ", "");
		for(int i=0; i<input.length(); i++){
			int shift = (int) input.charAt(i) - offset;
			int number = 1 <<shift;
			vector^=number;
		}
		if(vector == 0){return true;}
		int checkOnes = vector - 1;
		checkOnes &= vector;
		return checkOnes == 0;
	}
}
