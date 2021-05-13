package com.part3;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a file path: ");
		String file_path = scan.next();
		scan.close();
		try
		{
			File file = new File(file_path);
			System.out.println(file.getAbsoluteFile());
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			String s = "some more text:\n";
			bw.write(s);
			bw.close();
			
			
		}
		catch(Exception e) {
			System.out.println("Please enter a valid file path");
			e.printStackTrace();
		}
	}

}
