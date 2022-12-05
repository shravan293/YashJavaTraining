package com.example.topicArray;

import java.util.Arrays;

public class ArraysQues {

	public static void main(String[] args) {
		thirdMax();
	}
	public static void thirdMax() {
		int[] numList = { 10, 30, 20, 70, 100, 40, 40, 100 };
		Arrays.sort(numList);
		int size = numList.length;
		System.out.println(numList[size - 3]);
	}
}
