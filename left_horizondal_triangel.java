package star_pyramid_patterns;
import java.util.Scanner;
public class left_horizondal_triangel
{
Scanner sc=new Scanner(System.in);
void operation()
{
	System.out.println("enter rows :");
	int row=sc.nextInt();
	for(int i=1;i<row;i++)
	{
		for(int j=i;j<=row;j++)
		{
			System.out.print("  ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("  ");
		}
		for(int k=i;k<=row;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) 
	{
		left_horizondal_triangel lht=new left_horizondal_triangel();
		lht.operation();
	}
}
