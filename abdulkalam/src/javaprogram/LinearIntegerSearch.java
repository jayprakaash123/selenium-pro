package javaprogram;

import java.util.Scanner;

public class LinearIntegerSearch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int x=sc.nextInt();
	int[] num= {10,20,65,96,65,87,58,64,258,963214785};
	int count=num.length;
	int temp=0;
	for(int i=0;i<count;i++)
	{
		if(num[i]==x)
		{
			System.out.println("The number is present at " +i+ " index");
			temp=temp+1;
		}
	}
	if(temp==0)
	System.out.println("Given number is not present");
	

	}

}
