package telran.numbers;

import java.util.Arrays;

public class SportLotoAppl {

	public static void main(String[] args) {
		int res[] = new int[7];
		int num;
		for (int i = 0; i < res.length; i++) {
			do {
				num = getRandomNumber(1, 49);
			}
			while (ArrayInt.indexOf(res, num) >= 0); 
			res[i] = num;
		}
		System.out.println(Arrays.toString(res));
	}

	private static int getRandomNumber(int min, int max) {
		return (int) (min + Math.random() * (max - min + 1));
	}

}