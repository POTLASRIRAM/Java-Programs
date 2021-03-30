import java.util.Scanner;

public class ArrayMin {
	public static void main(String []args)
	{
		System.out.print("Enter array size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int min=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter array elements");
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(" "+min);
		
	}

}
