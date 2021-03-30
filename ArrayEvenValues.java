import java.util.Scanner;

public class ArrayEvenValues {
	public static void main(String []args)
	{
		System.out.print("Enter array size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter array elements");
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
			
		}
	}

}
