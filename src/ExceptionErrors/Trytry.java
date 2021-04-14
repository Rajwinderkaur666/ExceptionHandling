package ExceptionErrors;

public class Trytry 
{

	public static void main(String[] args) 
	{
	float x;
	try
	{
		x=5/0;
		//x=5/2;
		System.out.println("X is:"+x);
	}
    catch(ArithmeticException error)
	{
	System.out.println("Divisible by zero is not possible");
	}
	/*finally
	{
		System.out.println("Finall Block");
		s.close();
	}*/
	}

}
