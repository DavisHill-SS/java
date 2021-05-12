package com.part2;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random rand = new Random();
		int[][] matrix = new int[100][100];
		
		int max = 0;
		int max_i = 0;
		int max_j = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				try {
					matrix[i][j] = (int)(Math.random()*100);
				}
				catch(Exception e) {
					System.out.println(e);
				}
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					max_i = i;
					max_j = j;
				}
			}

		}
		
		System.out.println("The max number is " + max + " with an index of (" + max_i + "," + max_j + ")");
		

	}

}
