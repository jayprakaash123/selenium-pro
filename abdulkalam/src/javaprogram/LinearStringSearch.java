package javaprogram;

public class LinearStringSearch {

	public static void main(String[] args)
	{
		String[] arr= {"jay","prakash","choudhary","raj","amit","akash"};
		String name="akash";
		int temp=0;
		int count=arr.length;
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			if(arr[i].equalsIgnoreCase(name))
			{
				System.out.println("item present at " +i+  " index");
				temp=temp+1;
			}
			
		}
		if(temp==0)
		{
			System.out.println("iteam is not present");
		}

	}

}
