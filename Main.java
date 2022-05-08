
package com.greatlearning.dsa.assignment.main;
import java.util.Scanner;

import com.greatlearning.dsa.assignment.java.AdditionalServices;

public class Main {

	public static void main(String[] args) {
		int noofFloors;
		System.out.println("enter the no of floors in building");
		Scanner sc = new Scanner(System.in);
		noofFloors = sc.nextInt();
	   int sizeArray[] = new int[noofFloors];
		for(int i = 0; i< noofFloors; i++) {
			System.out.println("enter the floor size on"+(i+1));
			sizeArray[i] = sc.nextInt();
			
			AdditionalServices additionalServices = new AdditionalServices();
			System.out.println("The order of construction is as follows:" + (i+1));
		((AdditionalServices) additionalServices).displayDescendingOrder(sizeArray);
	
			
			
		}
		

	}

}
