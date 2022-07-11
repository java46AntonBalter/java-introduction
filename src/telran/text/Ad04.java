package telran.text;

import java.util.ArrayList;

public class Ad04 {

	public static boolean hasaValidBrackets(String text) {
		ArrayList<Character> buf = new ArrayList<Character>();
		int length = text.length();
		for (int i = 0; i < length; i++) {
			char x = text.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				buf.add(x);
			}

			if (x == ')' || x == ']' || x == '}') {
				if (buf.isEmpty()) {
					return false;
				}
				char check;
				switch (x) {
				case ')':
					check = buf.remove(buf.size() - 1);
					if (check == '{' || check == '[')
						return false;
					break;
				case '}':
					check = buf.remove(buf.size() - 1);
					if (check == '(' || check == '[')
						return false;
					break;
				case ']':
					check = buf.remove(buf.size() - 1);
					if (check == '{' || check == '(')
						return false;
					break;
				}
			}
		}
		return buf.isEmpty();
	}

}
