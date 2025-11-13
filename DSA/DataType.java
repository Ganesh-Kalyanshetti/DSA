class Gen<T>
{
	T ob;    	//placeholder
	Gen(T P)
	{
		ob = P;
	}
	
	T getOb()
	{
		return ob;
	}
	
	void showType()
	{
		System.out.println("The Data type of T is "+ob.getClass().getName());
	}
}
	
class GenDemo
{
	public static void main(String args[])
	{
		Gen<Integer> iob;
		iob = new Gen<Integer>(88);
		int a = iob.getOb();
		System.out.println("Value of a "+a);
		
		Gen<String> sob = new Gen<String>("Dhoni is the best");
		String str = sob.getOb();
		System.out.println("Value of a "+str);
		iob.showType();
		sob.showType();

		Gen<Double> fob = new Gen<Double>(16.485);
		//fob = new Gen<Double>(22);
		Double b = fob.getOb();
		System.out.println("Value of b is "+b);
		fob.showType();

	}
}
