package com.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercise 1
		List<String> list = new ArrayList<String>(Arrays.asList("cat","moose","eel","dog","bird","elephant","giraffe"));
		Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
		System.out.println(list);
		
		//Exercise 2
		Collections.sort(list, (s1, s2) -> s2.length() - s1.length());
		System.out.println(list);
		
		//Exercise 3
		Collections.sort(list, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		System.out.println(list);
		
		//Exercise 4
		Collections.sort(list, (s1, s2) -> Math.abs(s1.charAt(0)-'e') - Math.abs(s2.charAt(0)-'e'));
		System.out.println(list);
		
	}

}
