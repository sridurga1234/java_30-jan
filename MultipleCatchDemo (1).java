public class MultipleCatchDemo
{
	public static void main(String[] args)
	{
		try
		{
			int a[]=new int[5];
			a[8]=23/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("parent exception occurs");
		}
		System.out.println("rest of the code");
	}
}