package telran.numbers;

public class AdditionalTasksConsultation {
	public static int maxSubsequenceLength(int[] arr) {
		int count1 = 0;
		int count2 = 0;
		int buf = -1;
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				buf = arr[i];
			} else if(i > 0 && arr[i] == buf) {
				count1++;
			} else if (i > 0 && arr[i] != buf) {
				buf = arr[i];
				if(count1 > count2) {
				count2 = count1;
				count1 = 0;
				} else {
					count1 = 0;
				}
				count1++;
			}
		}
		int res = count1 > count2 ? count1 : count2;
		return res;
	}
	public static String toBinaryStr(int number) {
		String res = new String();  
		while(number > 0) {
			res = (number%2) + res;
			number = number / 2;
		}
		return res;
	}
}