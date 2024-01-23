import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.*;

import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram {
//	private static final String SENTINEL = "";
	public void run() {
		println("sorted({2,3,4,5}) -> true: " + sorted(new ArrayList<>(Arrays.asList(2, 3, 4, 5))));
		println("sorted({4,1,3,2}) -> true: " + sorted(new ArrayList<>(Arrays.asList(4, 1, 3, 2))));
		println("sorted({3,1,5,2,4}) -> false: " + sorted(new ArrayList<>(Arrays.asList(3, 1, 5, 2, 4))));
	}
	
	private boolean sorted(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				swapElems(a, i, j);
				if (sortedWithRiverse(a)) {
					return true;
				}
				swapElems(a, i, j);
			}
		}
		return false;
	}

	private void swapElems(ArrayList<Integer> a, int i, int j) {
		int tmp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, tmp);
	}

	private void reverseElems(ArrayList<Integer> a, int i, int j) {
		int mid = (j - i + 1) / 2;
		for (int k = 0; k < mid; k++) {
			swapElems(a, i + k, j - k);
		}
	}

	private boolean sortedWithRiverse(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				reverseElems(a, i, j);
				if (reallySorted(a)) {
					return true;
				}
				reverseElems(a, i, j);
			}
		}
		return false;
	}

	private boolean reallySorted(ArrayList<Integer> a) {
		for (int i = 1; i < a.size(); i++) {
			if (a.get(i) < a.get(i - 1)) {
				return false;
			}
		}
		return true;
	}
	
}


//		555 244 676


/*
 * 244
 * 121
 * 74
 * 148
 */




