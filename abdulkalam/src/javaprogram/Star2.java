package javaprogram;

public class Star2 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		for(int i=1;i<=6;i++) 
		{
			for(int j=6;j>=i;j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
