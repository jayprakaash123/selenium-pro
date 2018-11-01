package javaprogram;

public class Fibbo2 {

	public static void main(String[] args) {
		int a=0; int b=1; int c;
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		while(c<89)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}

	}

}
