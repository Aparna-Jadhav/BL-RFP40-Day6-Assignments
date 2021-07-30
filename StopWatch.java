package Day6;

import java.util.Scanner;

public class StopWatch 
{
	
	
	
	public static void main(String[] args) throws Exception
	{
		long startTime=0;
		long stopTime=0;
		long elapsed;
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter any number to Start Time: ");
		sc.nextInt();
		
		// Start time
		startTime=System.currentTimeMillis();
		System.out.println("Start Time : "+ startTime);

		System.out.println();
		System.out.println("Enter any number to Stop Time: ");
		sc.nextInt();
		
		// End time
		stopTime=System.currentTimeMillis();
		System.out.println("Stop Time : "+ stopTime);

		// Elapsed time
		elapsed=stopTime-startTime;
				
		System.out.println();
		System.out.println("Elapsed time (in milli seconds) :"+ elapsed);
		System.out.println();
		System.out.println("Elapsed time (in seconds) :"+(elapsed/1000.0)+" sec");
	}
}
