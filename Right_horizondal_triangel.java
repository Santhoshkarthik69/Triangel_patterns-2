package star_pyramid_patterns;

import java.util.Scanner;

public class Right_horizondal_triangel
{
Scanner sc=new Scanner(System.in);
void operation()
{
	System.out.println("enter rows :");
	int row=sc.nextInt();
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=1;i<row;i++)
	{
		for(int k=i;k<row;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) 
	{
		Right_horizondal_triangel rht=new Right_horizondal_triangel();
		rht.operation();

	}

}
