package javaprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		int x=11; int temp=0;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
			temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("number is not prime");
		}
		else 
		{
			System.out.println("number is prime");
		}

	}

}
