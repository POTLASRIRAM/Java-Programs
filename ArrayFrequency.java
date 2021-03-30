import java.util.Scanner;

public class ArrayFrequency {
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
		int visited = -1;  
		for(int i = 0; i < arr.length; i++)
		{  
		int count = 1;  
		for(int j = i+1; j < arr.length; j++)
		{  
		if(arr[i] == arr[j])
		{  
		count++;  
		fr[j] = visited;  
		}  
		}  
		if(fr[i] != visited)  
		fr[i] = count;  
		}  
		for(int i = 0; i < fr.length; i++)
		{  
			if(fr[i] != visited)  
			System.out.println("    " + arr[i] + "   " + fr[i]);  
			}  
		
	}

}
