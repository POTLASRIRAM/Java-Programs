import java.util.Scanner;

public class ArrayDuplicatesRemoval {
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
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
									}
			}
		}
	}
}
