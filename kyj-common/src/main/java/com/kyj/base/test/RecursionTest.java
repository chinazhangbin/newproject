package com.kyj.base.test;

public class RecursionTest {

	public static int computeAge(int n){
		if(n == 1) return 10;
		return computeAge(n-1) + 2;
	}
	
	public static void main(String[] args) {
		int age = computeAge(10);
		System.out.println(age);
	}
}
