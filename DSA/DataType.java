class TwoGen<T,V>
{
	T ob1;
	V ob2;
	TwoGen(T i,V j)
	{
		ob1=i;	
		ob2=j;

	}
	T getob1()
	{
		return ob1;
	}
	V getob2()
	{
		return ob2;
	}
	void showTypes()
	{	
		System.out.println("Type of T is :"+ob1.getClass().getName());
		System.out.println("Type of V is :"+ob2.getClass().getName());

	}
}

class SimGen
{
	public static void main(String args[])
	{

	TwoGen<Integer,String> tg = new TwoGen<Integer,String>(7,"Dhoni");
	
	int a = tg.getob1();
	String b = tg.getob2();
	System.out.println("Value of a is :"+a+" b is :"+b);
	tg.showTypes();
	}


	
}
