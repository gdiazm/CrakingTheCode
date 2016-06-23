package ArraysAndStrings;
import java.util.Collection;
import java.util.HashMap;

public class PermutationChecker {
	public boolean isStringPermutation(String s1, String s2){
		if(s1.length()!=s2.length()){return false;}
		HashMap<Character, Integer> hashMap = new HashMap<Character,Integer>();
		for(int i=0; i<s1.length(); i++){
			Character c = new Character(s1.charAt(i));
			if(hashMap.containsKey(c)){
				Integer val = hashMap.get(c);
				val++;
				hashMap.remove(c);
				hashMap.put(c,val);
			}else{
				hashMap.put(c, new Integer(1));
			}
		}
		for(int j=0; j<s2.length(); j++){
			Character k = new Character(s2.charAt(j));
			if(!hashMap.containsKey(k)){return false;}
			Integer v = hashMap.get(k);
			v--;
			hashMap.remove(k);
			hashMap.put(k,v);
		}
		Collection<Integer> values = hashMap.values();
		for(Integer ig : values){
			if(ig.intValue()>0){return false;}
		}
		return true;
	}
}
