package star_pyramid_patterns;
import java.util.Scanner;
public class pyramid 
{Scanner sc=new Scanner(System.in);
void operation()
{
	System.out.println("enter row:");
	int row=sc.nextInt();
	for(int i=1;i<=row;i++)
	{
		for(int j=i;j<=row;j++)
		{
			System.out.print("  ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		for(int l=1;l<i;l++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) 
	{
		pyramid p=new pyramid();
		p.operation();
	}
}
