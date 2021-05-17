package com.week1;

import java.util.Arrays;
import java.util.List;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1,1,1,1,2,2,3,3,4,4,4,5};
		int[] arr = {1,5,44,2,4,3,4,4,4,7,9,1,0,2,3,1,6,6,6,2,2,3,3,3,4,4,5,5,5,5,5,6,6,7,7,8,8};
		int r = 0;
		int l = 0;
		int target = 100999000;
		int sum = 0;
		while (r < arr.length || (l < r)) {
			if (r == arr.length && sum < target) {
				break;
			}
			if(sum < target) {
				do {
					sum += arr[r];
					r += 1;
					System.out.println(r);
				} while(r > 0 && r < arr.length && arr[r] == arr[r-1]);
				System.out.println("Yo");
			}
			else if(sum > target) {
				do {
					sum -= arr[l];
					l += 1;
				} while(l > 0 && arr[l] == arr[l-1]);
			}
			else {
				System.out.println("True");
				int[] temp = Arrays.copyOfRange(arr, l, r);
				System.out.println(Arrays.toString(temp));
				break;
			}
		}
		System.out.println("False");
		
	}
	
	private static void groupSumClump(int[] arr, Integer l, Integer r) {
		
	}

}
