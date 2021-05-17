package com.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lst = new ArrayList(Arrays.asList(1, 223, 54, 6698, 4));
		for (int i = 0; i < lst.size(); i ++) {
			lst.set(i, lst.get(i) % 10);
		}
		System.out.println(lst);
		
	}

}
