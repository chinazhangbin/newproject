package com.kyj.base.test;

public class BubblingSort {

	
	public static int[] sort(int[] arr){
		
		int temp = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j] >arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {323,322,332323,32,2,235353,445};
		int[] sort1 = sort(arr);
		for (int i : sort1) {
			System.out.println(i);
		}
	}
}
