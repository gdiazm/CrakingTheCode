package ArraysAndStrings;

public class UniqueChecker {
	public boolean isStringUnique(String s){
		s = s.toLowerCase();
		char[] c = s.toCharArray();
		int[] array = new int[(int)'z'-(int)'a'+1];
		int offset = (int)'a';
		for(int i=0; i<c.length; i++){
			int position = (int) c[i] - offset;
			if(array[position]>0){return false;}
			array[position]++;
		}
		return true;
	}
	
	public boolean isUniqueBitVector(String s){
		s = s.toLowerCase();
		int vector = 0;
		int offset = (int)'a';
		for(int i=0; i<s.length(); i++){
			int shift = (int) s.charAt(i) - offset;
			int newNumber = 1<<shift;
			if(vector>0 &&(vector & (newNumber)) > 0){return false;}
			vector = vector | newNumber;
		}
		return true;
	}
}
