package telran.text;

public class Strings {

	public static int[] deepNoRepeatedCompare(String str1, String str2) {
		int[] res = new int [2];
		for(int i = 0; i < str2.length(); i++) {
			if(str1.indexOf(str2.charAt(i)) == i) {
				++res[0];
			} else if (str1.indexOf(str2.charAt(i)) >= 0) {
				++res[1];
			}		
		}
		return res;	
}

	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) return false;
		int count[] = new int[26];
		for (int i = 0; i < str1.length(); i++) {
	        count[str1.toLowerCase().charAt(i) - 'a']++;
	        count[str2.toLowerCase().charAt(i) - 'a']--;
	    }
	    for (int i = 0; i < count.length; i++) {
	        if (count[i] != 0) {
	            return false;
	        }
	    }
	    return true;
	}
}