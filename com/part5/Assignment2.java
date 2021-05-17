package com.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Arrays.asList(2,4,25,3,896,7));
		System.out.println(method(list));

	}
	
	public static String method(List<Integer> list) {
		//StringBuilder result = new StringBuilder();
		List<String> result = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				result.add("e" + list.get(i));
			}
			else {
				result.add("o" + list.get(i));
			}
		}
		return String.join(",", result);
	}

}
