package javaprogram;

public class Secondlargest {

	public static void main(String[] args) {

   int a[]= {3,2,5,5,8,9,7,6,8,6,1,0};
   int temp;
   for(int i=0;i<=a.length;i++)
   {
	   for(int j=i+1;j<a.length;j++)
	   {
		   if(a[i]<a[j])
		   {
			   temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
		   }
	   }
   } 
   for(int i=0;i<a.length;i++)
   {
	   System.out.print(a[i]+ " ");
   }
	   
   System.out.println("second largest number is " + a[1]);

	}

}
