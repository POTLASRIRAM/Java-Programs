import java.util.Scanner;

public class ArrayCopy {
	public static void main(String []args)
	{
		int i=0;
		System.out.print("Enter array size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int  a[]= new int[n];
		int b[]=new int[n];
		for( i=0;i<n;i++)
		{
			System.out.print("Enter array elements");
			
			 a[i]=sc.nextInt();
			
		}
		System.out.print("\nArray elements of A=\n");
		for( i=0;i<n;i++)
		{
			System.out.println(" "+a[i]);
			b[i]=a[i];
			
		}
		System.out.println("Array elements of B=\n");
		for( i=0;i<n;i++)
		{
			System.out.println(" "+b[i]);
		}
	}

}
