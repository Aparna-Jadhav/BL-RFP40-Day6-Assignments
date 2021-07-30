package Day6;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args)
	{
		int number, rem=0, rev = 0;
		
		Scanner sc=new Scanner("System.in");
		
		System.out.println("Enter number : ");
		number=sc.nextInt();
		
		while(number > 0)
		{
			rem = number % 10 ;
			rev = rev * 10 + rem ;
			number = number / 10 ; 
		}
		System.out.println("Reverse number : " + rev);

	}

}
