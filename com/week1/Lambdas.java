package com.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lambdas {
	
	public static boolean returnBool(PerformOperation po, int num) {
		return po.if_bool(num);
	}
	
	public static PerformOperation isOdd() {
		return (num) -> num % 2 != 0;
	}
	
	public static PerformOperation isPrime() {
		return (num)  -> java.math.BigInteger.valueOf(num).isProbablePrime(1);
	}
	
	public static PerformOperation isPalindrome() {
		return (num) -> Integer.toString(num).equals(new StringBuilder(Integer.toString(num)).reverse().toString());
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rounds: ");
		int count = Integer.parseInt(reader.readLine());
		int method;
		int num;
		Lambdas l = new Lambdas();
		PerformOperation po;
		boolean bool;
		String input;
		while (count > 0) {
			System.out.print("Enter new line: ");
			input = reader.readLine().trim();
			StringTokenizer st = new StringTokenizer(input);
			method = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			switch(method) {
			case 1:{
				po = l.isOdd();
				bool = l.returnBool(po, num);
			}
			case 2:{
				po = l.isPrime();
				bool = l.returnBool(po, num);
			}
			case 3:{
				po = l.isPalindrome();
				bool = l.returnBool(po, num);
				
			}
			System.out.println(bool);
			count -= 1;
			}
		}
	}
	
	

}
