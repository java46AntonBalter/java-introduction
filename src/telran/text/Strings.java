package telran.text;

public class Strings {
	/**
	 * 
	 * @param name1 - first name
	 * @param name2 - second name
	 * @return either "match" or "no match" in accordance to the comments (see TODO)
	 */
	static public String matches(String name1, String name2) {
		String[] name1SplitArray = name1.toLowerCase().split(" ");
		String[] name2SplitArray = name2.toLowerCase().split(" ");
		int length1 = name1SplitArray.length;
		int length2 = name2SplitArray.length;
		int length = length1 > length2 ? length1 : length2;
		

		if(length1 == 1 && length2 == 1 && name1SplitArray[0].compareTo(name2SplitArray[0]) == 0) return "match";
		
		for(int i = 0; i < length; i++) {
			
		}
	
//	 TODO
//      String matches(String name1, String name2)
//      Names match under the following conditions, after breaking each one into "name parts" on whitespace :
//      - Two name parts match if they are the same (case insensitive) or one is a single letter initial and the other is longer but starts with the same letter.
//      - A name part in  the name1 may be missing from the name2
//      - Name parts in one name must not contradict name parts in the other
//      - Name parts that match must be in the same order in both names
	return"no match";

	}
	/**
	 * sorts array of strings
	 * @param strNumbers array of strings containing the positive integer numbers
	 * length of each string can not be more than three symbols
	 * String containing "123" should be greater than string containing "23" as the number 123 greater than
	 * number 23
	 */
	static public String[] sortStringsAsNumbers(String[] strNumbers) {
		int[] helper = fillInHelper(strNumbers);
		return fillInSortedNumbersAsStrings(helper, strNumbers);
	}

	static private int[] fillInHelper(String[] strNumbers) {
		int[] helper = new int[1000];
		for (int i = 0; i < strNumbers.length; i++) {
			helper[Integer.parseInt(strNumbers[i])]++;
		}
		return helper;
	}

	static private String[] fillInSortedNumbersAsStrings(int[] helper, String[] strNumbers) {
		int index = 0;
		for (int i = 0; i < helper.length; i++) {
			while (helper[i] > 0) {
				strNumbers[index] = String.valueOf(i);
				index++;
				helper[i]--;
			}
		}
		return strNumbers;
	}
}