import java.util.*;

public class ArraySort {
	public static void main(String []args)
	{
		System.out.print("Enter array size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int asc[]=new int[size];
		int des[]=new int[size];
		for(int i=0;i<asc.length;i++)
		{
			System.out.println("Enter array elements");
			int ele=sc.nextInt();
			asc[i]=ele;
		}
		Arrays.sort(asc);
		for(int i=0;i<asc.length;i++)
		{
			System.out.println(" "+asc[i]);
			
		}
		for(int i=asc.length-1;i>=0;i--)
		{
			des[i]=asc[i];
		}
		for(int i=des.length-1;i>=0;i--)
		{
			System.out.println(" "+des[i]);
		}
		
	}
}
