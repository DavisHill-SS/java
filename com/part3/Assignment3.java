package com.part3;

import java.io.FileReader;
import java.io.File;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp_s = "";
		try {
			for(String s: args) {
				temp_s += s;
			}
		}
		catch(Exception e) {
			System.out.println("Please make sure to enter correct command line arguments");
			e.printStackTrace();
		}

		char[] target = temp_s.toCharArray();
		int count = 0;
		char[] chars = new char[1000];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a file path: ");
		String file_path = scan.next();
		
		try {
			File file = new File(file_path);
			FileReader fr = new FileReader(file);
			fr.read(chars);
			fr.close();
		}
		catch(Exception e) {
			System.out.println("Please enter a valid file path");
			e.printStackTrace();
		}
		
		for(char c: chars) {
			if (c == target[0]){
				count += 1;
			}
		}
		System.out.println(args[0] + " was found " + count + " times in the file");
		scan.close();
		
	}

}
