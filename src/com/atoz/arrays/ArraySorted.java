package com.atoz.arrays;

public class ArraySorted {

	static boolean arraySorted(int arr[]) {	
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
			
		}	
		return true;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,9,8};
		System.out.println(arraySorted(arr));
	}
	
}
