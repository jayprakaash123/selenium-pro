package javaprogram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//take the input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String word=sc.nextLine();
		//StringBuffer buffer=new StringBuffer();
		for(int i=word.length()-1;i>=0;i--) {
			
       System.out.print(word.charAt(i));
		//buffer.append(word.charAt(i));		
			}
		//System.out.println(buffer);
	}
	

}
