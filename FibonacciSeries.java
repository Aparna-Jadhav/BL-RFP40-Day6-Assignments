package Day6;

import java.util.Scanner;

public class  FibonacciSeries
{  
	public static int FibonacciSerie(int tillNum) 
	{
		if(tillNum==0)
		{
			return 0;
		}
	    if(tillNum == 1 || tillNum == 2)
	    {
	        return 1;
	    }
	    return FibonacciSerie(tillNum-2) + FibonacciSerie(tillNum-1);
	}
	   
	
	public static void main(String args[])
	{
		 int tillNum = 0, i; 

		System.out.println("How many numbers you want in Fibonacci:");
        Scanner sc = new Scanner(System.in);
        tillNum = sc.nextInt();
        System.out.println("Fibonacci Series of "+tillNum+" numbers:");
		sc.close();
		
		for (i=0; i<=tillNum; i++)
		{
		 System.out.println(FibonacciSerie(i));
		}
	}

}
