package telran.numbers;

public class IntegerPrimitives {

	public static byte getMaxByte() {
		byte res = 1;
		while (res > 0) {
			res = (byte) (res * 2);

		}
		return (byte) (res - 1);
	}

	public static byte getMinByte() {
		return (byte) (getMaxByte() + 1);
	}

	public static int getLengthByte() {
		return (int) (getLength(getMaxByte()));
	}

	public static char getMaxChar() {
		char res = 1;
		while (res > 0) {
			res = (char) (res * 2);

		}
		return (char) (res - 1);
	}

	public static char getMinChar() {
		return (char) (getMaxChar() + 1);
	}

	public static int getLengthChar() {
		return (int) getLength(getMaxChar());
	}

	public static short getMaxShort() {
		short res = 1;
		while (res > 0) {
			res = (short) (res * 2);
		}
		return (short) (res - 1);
	}

	public static short getMinShort() {
		return (short) (getMaxShort() + 1);
	}

	public static int getLengthShort() {
		return (int) (getLength(getMaxShort()));
	}

	public static int getMaxInt() {
		int res = 1;
		while (res > 0) {
			res = (int) (res * 2);
		}
		return (int) (res - 1);
	}

	public static int getMinInt() {
		return (int) (getMaxInt() + 1);
	}

	public static int getLengthInt() {
		return (int) (getLength(getMaxInt()));
	}

	public static long getMaxLong() {
		long res = 1;
		while (res > 0) {
			res = res * 2;
		}
		return res - 1;
	}

	public static long getMinLong() {
		return (long) (getMaxLong() + 1);
	}

	public static int getLengthLong() {
		return (int) (getLength(getMaxLong()));
	}

	private static int getLength(long x) {
		double bin = Long.toBinaryString(x).length();
		return (int) Math.ceil(bin / 8); 
	}

}