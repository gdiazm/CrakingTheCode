package ArraysAndStrings;

public class OneAwayChecker {
	public boolean oneAway(String a, String b){
		int vector = 0, offset =(int) 'a';
		if(b.length() > a.length()){
			String aux = a;
			a = b;
			b = aux;
		}
		a.toLowerCase();
		b.toLowerCase();
		for(int i=0; i<a.length(); i++){
			int shift = a.charAt(i) - offset;
			vector |= 1<<shift;
		}
		for(int i=0; i<b.length(); i++){
			int shift = b.charAt(i) - offset;
			vector &= ~ 1<<shift;
		}
		
		if(vector == 0){return true;}
		int countEdits = vector - 1;
		countEdits &= vector;
		return countEdits == 0;
	}
}
