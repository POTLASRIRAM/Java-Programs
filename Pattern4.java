import java.util.Scanner;

public class Pattern4 {
	public static void main(String []args)
	{
		System.out.print("Enter number of rows");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			
			}
			System.out.println();
		}
	}

}
