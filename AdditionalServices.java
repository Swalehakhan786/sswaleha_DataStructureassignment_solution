
package com.greatlearning.dsa.assignment.java;

public class AdditionalServices {
	public void displayDescendingOrder(int[] sizeArray) {
		System.out.println("The order of construction is as follows: ");
		
		for(int i = sizeArray.length - 1; i > 0; i--)
			System.out.print(sizeArray[i] + " ");
		System.out.println();
	}



}
