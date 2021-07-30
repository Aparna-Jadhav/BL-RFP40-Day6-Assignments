package Day6;
import java.util.Scanner;

public class PerfectNumber 
{

	public static void main(String[] args) 
	{
		int number, i, result=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		number=sc.nextInt();
		
		for(i=1; i < number; i++)
		{
			if(number % i == 0)
			{
				result+=i;
			}
					}
		
		if(number == result) 
		{
			System.out.println("The given number is perfect number");
		}
		else
		{
			System.out.println("The given number is not perfect number");
		}

	}

}
