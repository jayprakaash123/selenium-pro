package javaprogram;

import java.util.Scanner;

public class CharString {

	public static void main(String[] args) {
		// take the input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String word=sc.nextLine();
		for(int i=0;i<=word.length()-1;i++)
		{
			char y=word.charAt(i);
			System.out.print(y+" ");
		}
	
		

	}

}
