class ThrowsDemo
{
	static void throwOne() throws IllegalAccessException
	{
		System.out.println("inside throwOne");
		throw new IllegalAccessException("Ganesh");
	}

	public static void main(String args[])
	{
		try
		{
			throwOne();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Cought the Exception:"+e);
		}
		finally
		{
			System.out.println("At the end of the program");
		}
		
		System.out.println("HELLO BACK");
		
	}
}
