package com.part1;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exercise 1
		System.out.println("1)");
		String s = "";
		for (int i = 0; i < 5; i++){
			if (i < 4) {
				s += "*";
				System.out.println(s);
			}
			else System.out.println(".........");
		}
		
		// Exercise 2
		System.out.println("2)");
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				System.out.println("..........");
			}
			else {
				System.out.println(s);
				s = s.substring(0, s.length()-1);
			}
		}
		
		// Exercise 3
		System.out.println("3)");
		s = "*";
		String pad_left = "     ";
		String pad_right = "     ";
		for(int i = 0; i < 5; i++) {
			if (i < 4) {
				System.out.println(pad_left + s + pad_right);
				pad_left = pad_left.substring(0, pad_left.length()-1);
				pad_right = pad_right.substring(0, pad_right.length()-1);
				s += "**";
			}
			else {
				System.out.println("...........");
			}
		}
		
		// Exercise 4
		System.out.println("4)");
		pad_right += " ";
		for(int i = 0; i < 5; i++) {
			if (i == 0) {
				System.out.println("............");
			}
			else {
				s = s.substring(0, s.length()-2);
				pad_left += " ";
				pad_right += " ";
				System.out.println(pad_left + s + pad_right);
			}
		}
		

	}

}
