package com.jeevika.leetcode;

import java.util.Arrays;

public class MissingPositive {

	public static void main(String[] args) {
		int[] nums= {1,2,0};
		firstMissingPositive(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static int firstMissingPositive(int[] nums) {
		int i = 0;
		while (i < nums.length ) {

			int current = nums[i] - 1;

			// it will check the present arr[i] is equal to the current arr[i]
			if (nums[i] != nums[current]) {

				// then we need swap those elements
				swap(nums, i, current);
			} else {

				// if comparing elements are at there places the increment the i
				i++;
			}

		}
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				return index+1;
				
			}
		}
		return -1;
	}
	static void swap(int[] arr, int i, int current) {
		int temp = arr[i];
		arr[i] = arr[current];
		arr[current] = temp;
	}
}
