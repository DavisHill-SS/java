package com.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("ab","aabbaa", "abaa", "aaa", "bbb", "bbbb"));
		List<String> result = list.stream().filter((s) -> s.charAt(0) == 'a')
				.filter(s -> s.length() == 3).collect(Collectors.toList());;
		System.out.println(result);
	}
}
