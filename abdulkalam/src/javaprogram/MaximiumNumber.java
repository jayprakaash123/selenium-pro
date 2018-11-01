package javaprogram;

import java.util.Scanner;

public class MaximiumNumber {

	public static void main(String[] args) {
		// Take input from keyboard
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number");
		//int x=sc.nextInt();
		int a[]= {5,8,6,3,2,8,5,};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)  //for min value a[i]<min
			{
				max=a[i];
			}
		}
		System.out.println("maximium number is: " +max);
		

	}

}
	
		
		
		
		
	

	
	
	