package telran.text;

public class Strings {
	//*****************************Task 1 **************************************
	static public String matches(String name1, String name2) {
		String[] name1SplitArray = name1.toLowerCase().split(" ");
		String[] name2SplitArray = name2.toLowerCase().split(" ");
		int length1 = name1SplitArray.length;
		int length2 = name2SplitArray.length;
		if (length1 == 1 && length2 == 1 && name1SplitArray[0].compareTo(name2SplitArray[0]) == 0)
			return "match";
		
		int[] helper = compareElements(name1SplitArray, name2SplitArray, length1, length2);
		
		if (checkContradiction(name1SplitArray, name2SplitArray, length1, length2) == true) return "no match";

		if (isSorted(helper) == true) {
			return "match";
		} else {
			return "no match";
		}
	}
	
	private static int[] compareElements(String[] name1SplitArray, String[] name2SplitArray, int length1, int length2) {
		int[] helper = new int[length2];
		int helperIndex = 0;
		for (int i = 0; i < length1; i++) {
			for (int j = 0; j < length2; j++) {
				if (name1SplitArray[i].compareTo(name2SplitArray[j]) == 0 || (name1SplitArray[i].length() == 1
						&& name1SplitArray[i].compareTo(name2SplitArray[j].substring(0, 1)) == 0)) {
					helper[helperIndex] = j;
					helperIndex++;  
				}
			} 
		}
		return helper;
	}
	private static boolean checkContradiction(String[] name1SplitArray, String[] name2SplitArray, int length1, int length2) {
        int helperContradiction = 0;
		if (length1 == length2 && length1 > 1) {
			for (int i = 0; i < length2; i++) {
				for (int j = 0; j < length1; j++) {
					if ((name1SplitArray[i].length() != 1 && name2SplitArray[i].compareTo(name1SplitArray[j]) != 0)
							|| (name1SplitArray[i].length() == 1
									&& name1SplitArray[i].compareTo(name2SplitArray[j].substring(0, 1)) != 0)) {
						helperContradiction++;
					}
				}
				if (helperContradiction == length1)
					return true;
				helperContradiction = 0;
			}
		}
		return false;
	}

	private static boolean isSorted(int[] a) {
		if (a.length == 1) {
			return true;
		}

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}

		return true;
	}
//**************************************Task 2****************************************
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