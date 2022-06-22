package telran.numbers;
import java.util.Arrays;

public class SportLotoAppl {

	public static void main(String[] args) {
		int res[] = new int[7];
		for (int i = 0; i < res.length; i++) {
			res[i] = getRandomNumber(1, 49);
			res[i] = ArrayInt.indexOf(res, res[i]) == i? getRandomNumber(1, 49) :  res[i];
		}
		System.out.println(Arrays.toString(res));
	}

	private static int getRandomNumber(int min, int max) {
		return (int) (min + Math.random() * (max - min + 1));
	}

}