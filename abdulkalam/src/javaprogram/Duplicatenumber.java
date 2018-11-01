package javaprogram;

public class Duplicatenumber {

	public static void main(String[] args) {
		int a[]= {2,3,6,9,8,5,2,14,7,8,9,6,3,5};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] &&(i!=j))
				{
					System.out.print(a[j]);
				}
			}
		}
			}

}
