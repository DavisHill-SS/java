package com.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = new ArrayList<>(Arrays.asList(2,4,52,31585,7,3,1));
		for(int i = 0; i < lst.size(); i++) {
			lst.set(i, lst.get(i) * 2);
		}
		System.out.println(lst);
	}

}
