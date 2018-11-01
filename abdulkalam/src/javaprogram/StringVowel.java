package javaprogram;

import java.util.Scanner;

public class StringVowel {

	public static void main(String[] args) {
		// Take input from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String word=sc.nextLine();
		int vowel=0;
		int consonant=0;
		int space=0;
		int digit=0;
		
		for(int i=0;i<=word.length()-1;i++)
		{
			char y=word.charAt(i);
			if(y=='a'|| y=='A' || y=='e'||y=='E'|| y=='i'||y=='I'|| y=='o'||y=='O'|| y=='u'||y=='U')
			{
				vowel++;
			}
			else
			{
				consonant++;
			}
			 if(y==' ')
			{
				space++;
			}
		//	else(y>='0' || y<='9')
			{
				digit++;
			}
		}
		System.out.println("vowel:"+ vowel + "\nconsonant:"+ consonant);
		System.out.println("space:"+ space + "\ndigit:"+ digit);

	}

}
