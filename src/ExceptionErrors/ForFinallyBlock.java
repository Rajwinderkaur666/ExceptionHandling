package ExceptionErrors;

import java.util.Scanner;

public class ForFinallyBlock 
{
int x,res;
Scanner oo=new Scanner(System.in);
public void java()

{
	
	System.out.println("Enter value for x:");
	x= oo.nextInt();
	try
	{
		res=x/2;
		System.out.println("Result is:"+res);

		
	}
	catch(ArithmeticException e)
	{
		System.out.println("Please check your code");
		
	}
}

	public static void main(String[] args) 
	{
		ForFinallyBlock oo=new ForFinallyBlock();
		oo.java();
	}

}
