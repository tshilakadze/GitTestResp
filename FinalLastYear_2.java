//ამოცანა 2. (20 ქულა) მატრიცის განულება
//დაწერეთ მეთოდი zero რომელსაც გადაეცემა ორგანზომილებიანი ინტების
//მასივი(მატრიცა), რომელიც არაფერს არ აბრუნებს და რომელიც გადაცემულ
//მატრიცას “ანულებს”.
//განულების წესი შემდეგია: თუკი თავდაპირველ მატრიცაში სადმე გვხვდება 0
//მაშინ მატრიცის მთელი ის სვეტი და სტრიქონი უნდა განულდეს. მაგალითად:
//თუკი მეთოდს გადაეცა მატრიცა:
//[[1, 0, 3, 4],
// [5, 6, 7, 8],
// [9, 0, 1, 2]]
//მაშინ მეთოდმა იგი უნდა შეცვალოს შემდეგნაირად:
//[[0, 0, 0, 0],
// [5, 0, 7, 8],
// [0, 0, 0, 0]]
//ამ ამოცანის გადასაჭრელად არ შექმნათ მასივები(მატრიცებიც) და ArrayListები.

import java.util.Arrays;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class FinalLastYear_2 extends ConsoleProgram {
	private int tmp;
	public void run() {
		int[][] before = { { 1, 0, 3, 4 }, 
						   { 5, 6, 7, 8 }, 
						   { 9, 0, 1, 2 } };
		int[][] after = { { 0, 0, 0, 0 },
				          { 5, 0, 7, 8 }, 
				          { 0, 0, 0, 0 } };
		
		println(before.length);
		println(before[0].length);
		
		printMatrix(before);
		println("Expected: ");
		printMatrix(after);
		println("Actual:");
		zeroMatrix(before);
	}
	
	private void zeroMatrix(int[][] mat) {
		tmp = tempNum(mat);
		for(int r = 0; r < mat.length; r++){
			for(int c = 0; c < mat[0].length; c++){
				if(mat[r][c] == 0){
					changeRowNums(mat, r);
					changeColNums(mat, c);
				}
			}
		}
		changeToZero(mat);
		printMatrix(mat);
	}

	private void changeToZero(int[][] mat) {
		for(int r = 0; r < mat.length; r++){
			for(int c = 0; c < mat[0].length; c++){
				if(mat[r][c] == tmp){
					mat[r][c] = 0;
				}
			}
		}
	}

	private void changeColNums(int[][] mat, int c) {
		for(int i = 0; i < mat.length; i++){
			if(mat[i][c] != 0){
				mat[i][c] = tmp;
			}
		}
	}

	private void changeRowNums(int[][] mat, int r) {
		for(int i = 0; i < mat[r].length; i++){
			if(mat[r][i] != 0){
				mat[r][i] = tmp;	
			}
		}
	}

	
	
	
	
	private int tempNum(int[][] mat) {
		for(int i = 0; i <= mat.length * mat[0].length; i++){
				if(!contains(mat, i)){
					return i;
				}
		}
		return -1;
	}

	private boolean contains(int[][] mat, int num) {
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[0].length; j++){
				if(num == mat[i][j]){
					return true;
				}
			}
		}
		return false;
	}

	private void printMatrix(int[][] matrix) {
		for (int[] arr : matrix) {
			println(Arrays.toString(arr));
		}
	}
}