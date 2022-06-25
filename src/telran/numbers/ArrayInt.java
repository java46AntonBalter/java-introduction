package telran.numbers;

import java.util.Arrays;

public class ArrayInt {
	public static int[] addNumber(int ar[], int number) {
		int res[] = Arrays.copyOf(ar, ar.length + 1);
		res[ar.length] = number;
		return res;

	}

	public static int[] insertNumber(int ar[], int index, int number) {
		int res[] = new int[ar.length + 1];
		System.arraycopy(ar, 0, res, 0, index);
		res[index] = number;
		System.arraycopy(ar, index, res, index + 1, ar.length - index);
		return res;
	}

	public static int[] removeNumber(int ar[], int index) {
		int res[] = new int[ar.length - 1];
		System.arraycopy(ar, 0, res, 0, index);
		System.arraycopy(ar, index + 1, res, index, res.length - index);
		return res;

	}

	public static int indexOf(int ar[], int number) {
		int res = -1;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == number) {
				res = i;
				break;
			}
		}
		return res;
	}

	public static void sort(int[] ar) {
		boolean swapped;
		if (ar == null || ar.length == 0) {
			return;
		}
		for (int i = 0; i < ar.length; i++) {
			swapped = false;
			swapped = moveMaxToEnd(ar, i, swapped);
			if (swapped == false) {
				break;
			}
		}
	}

	private static boolean moveMaxToEnd(int[] ar, int i, boolean swapped) {
		for (int j = 1; j < ar.length - i; j++) {
			if (ar[j - 1] > ar[j]) {
				swap(ar, j);
				swapped = true;
			}
		}
		return swapped;
	}

	private static void swap(int[] ar, int index) {
		int tmp = ar[index - 1];
		ar[index - 1] = ar[index];
		ar[index] = tmp;

	}

	public static int binaryIndexOf(int[] ar, int number) {
		int res = 0;
		int left = 0;
		int right = ar.length - 1;
		int middle = ar.length / 2;
		while (left <= right && ar[middle] != number) {
			if (ar[middle] < number) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
			middle = (left + right) / 2;
		}
		res = middle;
		while (middle > 0 && ar[middle] == number && ar[middle - 1] == number) {
			res = --middle;
		}
		if (ar[middle] != number) {
			res = -(left + 1);
		}

		return res;
	}
}