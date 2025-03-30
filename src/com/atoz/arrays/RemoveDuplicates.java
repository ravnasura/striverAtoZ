package com.atoz.arrays;

public class RemoveDuplicates {

	static int [] duplicates(int arr []) {
		int second=0;
		for(int first=1;first<arr.length;first++) {
			if(arr[second]==arr[first]) {
			//	System.out.println("duplicates"+first+second);
			arr[first]=arr[second];
			
			}
			second++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,1,2,3,3,5,6,7,8,9};
		
		System.out.println(duplicates(arr));
	}
}
