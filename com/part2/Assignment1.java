package com.part2;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num;
		
		for(String s: args) {
			try {
				num = Integer.parseInt(s);
				sum += num;
			}
			catch(Exception e) {
				e.printStackTrace();
			}

		}
		
		System.out.println("The sum is equal to " + sum);
	}

}
