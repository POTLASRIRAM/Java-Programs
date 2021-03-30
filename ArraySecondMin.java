import java.util.Arrays;
import java.util.Scanner;

public class ArraySecondMin {
	public static void main(String []args)
	{
		System.out.print("Enter array size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		int fr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter array elements");
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" Array element at index "+i+" = "+arr[i]);
		}
		System.out.println(arr[1]);
		
	}

}
