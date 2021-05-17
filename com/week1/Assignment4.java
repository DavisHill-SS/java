package com.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<>(Arrays.asList("xax","xxsccxs", "a", "xxi"));
		String s;
		for(int i = 0; i < lst.size(); i++) {
			s = lst.get(i).replace("x", "");
			lst.set(i, s);
		}
		System.out.println(lst);
	}

}
