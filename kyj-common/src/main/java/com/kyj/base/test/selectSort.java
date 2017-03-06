package com.kyj.base.test;

public class selectSort {

	public static void main(String[] args) {
		int[] arr ={1,8,2,7,4,3};
		seleSort(arr);
		//bubblingSort(arr);
	}
	
	public static void seleSort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
					
			for (int j = i+1; j < arr.length; j++) {
				int tmp; 
				if(arr[i] < arr[j]){
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		printArr(arr);
	}
	
	public static void bubblingSort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				int tmp;
				if(arr[j] > arr[j+1]){
					tmp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		printArr(arr);
	}
	
	public static void printArr(int[] arr){
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
