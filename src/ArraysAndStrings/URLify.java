package ArraysAndStrings;

public class URLify {
	public String toURL(String input, int n){
		char[] array = input.toCharArray();
		int j = array.length-1;
		for(int i = n-1; i>=0; i--){
			if(array[i]==' '){
				array[j--] = '0';
				array[j--] = '2';
				array[j--] = '%';
			}else{
				array[j--] = array[i];
			}
		}
		return new String(array);
	}
}
