import java.io.*;
class A
{
	 void method()throws IOException
	{
		throw new IOException("device error");
	}
}
class ThrowsDemo
{
	public static void main(String args[])throws IOException
	{
		A aobj=new A();
		aobj.method();
		System.out.println("further process");
	}
}