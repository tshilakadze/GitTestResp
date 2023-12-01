import acm.program.ConsoleProgram;

import java.util.*;

public class testAgain extends ConsoleProgram {
	private static final String ZEROS = "00000000000000000000000000000000";

	public void run() {
		while (true) {
			int num = readInt("Enter number: ");
			println(reverseBinNum(num));
		}
	}

	// we should save result in long to be able to save ints up to 2^32
	private long reverseBinNum(int num) {
		String binaryStr = IntToBinaryStr(num);
		String reveredBinaryStr = reversedBinaryString(binaryStr);
		println(binaryStr);
		println(reveredBinaryStr);
		long result = binaryStrToInt(reveredBinaryStr);
		return result;
	}

	private String IntToBinaryStr(int num) {
		String result = ZEROS; // 32 zeros
		int i = result.length() - 1; // 32 - 1 -- max index
		// we start setting binary digits from the end of the string
		while (num > 0) {
			int currBinaryDigit = (num % 2);
			if (currBinaryDigit == 1) {
				result = result.substring(0, i) + '1' + result.substring(i + 1);
			}
			num /= 2;
			i--;
		}
		return result;
	}

	private String reversedBinaryString(String s) {
		for (int i = 0; i < s.length(); i++) {
			char reveredCh = '0';
			if (s.charAt(i) == '0') {
				reveredCh = '1';
			}
			s = s.substring(0, i) + reveredCh + s.substring(i + 1);
		}
		return s;
	}

	private long binaryStrToInt(String str) {
		long result = 0;
		for (int i = 0; i < str.length(); i++) {
			int currDigit = str.charAt(i) - '0';
			result += currDigit * Math.pow(2, str.length() - 1 - i);
			// println(currDigit + " * 2^" + (str.length() - 1 - i));
		}

		return result;
	}
}