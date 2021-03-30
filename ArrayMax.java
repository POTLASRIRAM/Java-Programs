import java.util.Scanner;

public class ArrayMax {
	public static void main(String []args)
	{
		System.out.print("Enter array size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter array elements");
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(" "+max);
		
	}

}
