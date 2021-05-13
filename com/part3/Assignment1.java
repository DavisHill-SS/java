package com.part3;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Assignment1 {
	
	public static ArrayList<String> getFileNames(File directory){
		ArrayList<String> result = new ArrayList<String>();
		Queue<File> queue = new ArrayDeque<File>();
		queue.add(directory);
		
		while(queue.size() > 0) {
			File current = queue.remove();
			result.add(current.getName());
			if(current.isDirectory()) {
				for(File file: current.listFiles()) {
					queue.add(file);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter a directory path to search: ");
		Scanner scan = new Scanner(System.in);
		String path = scan.next();
		scan.close();
		
		File newfile = new File(path);
		ArrayList<String> fileNames = getFileNames(newfile);
		for(String file: fileNames) {
			System.out.println(file);
		}
		
	}

}
