//ამოცანა 3. (20 ქულა) თითქმის დასორტირებული
//მთელი რიცხვების არაილისტს ეწოდება დასორტირებული თუკი მისი ყოველი
//მომდევნო ელემენტი წინაზე მეტია ან ტოლი.
//მთელი რიცხვების არაილისტს ეწოდება თითქმის დასორტირებული თუკი შემდეგი
//ორი ოპერაციით შეგვიძლია მისგან დასორტირებული არაილისტი მივიღოთ:
//1. ორ ელემენტს გაუცვალეთ ადგილი.
//მაგალითად ამ ოპერაციით არაილისტისგან {5,4,3,2,1} შეგვიძლია მივიღოთ
//{1,4,3,2,5} - პირველ და ბოლო ელემენტს გავუცვალეთ ადგილი.
//2. აირჩიეთ ორი რიცხვი 0<=i<j<N სადაც N არაილისტში ელემენტების
//რაოდენობაა. და ელემენტები ინდექსებით, i,i+1, …, j შემოატრიალეთ, ისე,
//რომ იმავე ადგილას იყვნენ ოღონდ შებრუნებული მიმდევრობით: j,j-1, … i.
//მაგალითად ამ ოპერაციით არაილისტისგან {1,4,3,2,5} შეგვიძლია მივიღოთ
//{1,2,3,4,5} ანუ i=1, j=3, შესაბამისად {4,3,2} შემოვატრიალეთ.
//თქვენი ამოცანაა დაწეროთ sorted მეთოდი რომელსაც გადაეცემა არაილისტი და
//რომელიც აბრუნებს true-ს თუკი ეს არაილისტი თითქმის დასწორტირებულია,
//წინააღმდეგ შემთხვევაში კი false-ს.
//გაითვალისწინეთ, რომ ჯერ პირველი ოპერაცია უნდა შეასრულოთ ერთხელ და მერე
//მეორე ასევე ერთხელ.
//მაგალითად:
//sorted({2,3,4,5})->true {2,3,4,5} -> {3,2,4,5} -> {2,3,4,5}
//sorted({4,1,3,2})->true {4,1,3,2} -> {1,4,3,2} -> {1,2,3,4}
//sorted({3,1,5,2,4})->false არ მოიძებნება ასეთი ორი ოპერაცია.
import java.util.*;

import acm.program.*;
public class FinalLastYear_3 extends ConsoleProgram {
	public void run() {
		println("sorted({2,3,4,5}) -> true: " + sorted(new ArrayList<>(Arrays.asList(2, 3, 4, 5))));
		println("sorted({4,1,3,2}) -> true: " + sorted(new ArrayList<>(Arrays.asList(4, 1, 3, 2))));
		println("sorted({3,1,5,2,4}) -> false: " + sorted(new ArrayList<>(Arrays.asList(3, 1, 5, 2, 4))));
	}

	
	
	private boolean sorted(ArrayList<Integer> test) {
		for(int i = 0; i < test.size(); i++){
			for(int j = i + 1; j < test.size(); j++){
				swapNums(test, i, j);
				reverseArrayList(test);
				if(isSorted(test)){
					return true;
				}
			}
		}
		return false;
	}



	private void swapNums(ArrayList<Integer> test, int i, int j) {
		int a = test.get(i);
		test.set(i, test.get(j));
		test.set(j, a);
	}



	private boolean isSorted(ArrayList<Integer> test) {
		for(int i = 1; i < test.size(); i++){
			if(test.get(i - 1) > test.get(i)){
				return false;
			}
		}
		return true;
	}



	private void reverseArrayList(ArrayList<Integer> test) {
		for(int i = 0; i < test.size(); i++){
			for(int j = i + 1; j < test.size(); j++){
				int a = (j - i  + 1)/2;
				for(int l = 0; l < a; l++){
					swapNums(test, l + i, j - l);
				}
			}
		}
	}
}
