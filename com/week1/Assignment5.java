package com.week1;

import java.util.Arrays;
import java.util.List;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,8};
		int r = 0;
		int l = 0;
		int target = 10;
		int sum = 0;
		boolean result = false;
		while (r < arr.length || (l < r)) {
			if (r == arr.length && sum < target) {
				break;
			}
			if(sum < target) {
				do {
					sum += arr[r];
					r += 1;
				} while(r > 0 && r < arr.length && arr[r] == arr[r-1]);
			}
			else if(sum > target) {
				do {
					sum -= arr[l];
					l += 1;
				} while(l > 0 && arr[l] == arr[l-1]);
			}
			else {
				System.out.println("True");
				result = true;
				int[] temp = Arrays.copyOfRange(arr, l, r);
				System.out.println(Arrays.toString(temp));
				break;
			}
		}
		if (!result) {
			System.out.println("False");
		}
		
		
	}

}
