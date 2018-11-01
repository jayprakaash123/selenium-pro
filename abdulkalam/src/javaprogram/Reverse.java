package javaprogram;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String name=sc.nextLine();
		int l=name.length();
		System.out.println("length of string "+l);
		String rev="";
		for(int i=l-1;i>=0;i--)
		{
			 rev= rev+name.charAt(i);
		}
		System.out.println("reverse string is "+rev);
		

	}

}
