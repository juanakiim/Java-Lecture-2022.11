package ch05; 
/**
 * 다차원 배열 
 * @author juana
 *
 */
public class Ex14_MultiDimension {

	public static void main(String[] args) {
		
		int[][] matrix = new int[2][3]; // 행의갯수가 2, 열의갯수가 3
		int[][] score = {{80,90,84}, {78,85,95}}; // 학생 두명의 국어, 영어, 수학 성적 
		
		/*
		 *         80  90 84
		 *         78  85 95
		 *         [row][colum]
		 */
		
		System.out.println(score[0][0]);
		System.out.println(score[1][1]);
		
		System.out.println(matrix.length); // 행의 갯수 
		System.out.println(matrix[0].length); // 열의 갯수 	
		
		for(int i=0; i<score.length; i++) {
			for(int k=0; k < score[0].length; k++ ) {
				System.out.print(score[i][k] + " ");
			}
			
			System.out.println();
		}

	}

}
