package com.atoz.arrays;

public class Secondlargest {

	static int secondlargest(int arr[]) {
		int secondMax=Integer.MIN_VALUE,largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondMax=largest;
				largest=arr[i];
			}
			
			if(arr[i]<largest && arr[i]>secondMax) {
				secondMax=arr[i];
			}
			
		}
		return secondMax;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,8,7,4,5};
		
		System.out.println(secondlargest(arr));
		
	}
	
}
