class Callme
{
	void call(String msg)
	{
		System.out.println("["+msg);
		try
		{
			Thread.sleep(1000);

		}
		catch(InterruptedException e)
		{
			System.out.println("Error is :"+e);
		}
		System.out.println("]");
	}

}

class Caller implements Runnable
{
	Callme target;
	String msg;
	Thread t;
	
	public Caller(Callme targ,String s)
	{
		target=targ;
		msg=s;
		t = new Thread(this);
		
	}
	
	public void run()
	{
		synchronized(target)
		{
			target.call(msg);
		}
	}

}

class Sync
{

	public static void main(String args[])
	{
		Callme target = new Callme();

		Caller ob1 = new Caller(target,"Java");
		Caller ob2 = new Caller(target,"AIR 171");
		Caller ob3 = new Caller(target,"Boeing");		

		ob1.t.start();
		ob2.t.start();
		ob3.t.start();
		
		System.out.println("ob1 is:"+ob1.t.isAlive());
		System.out.println("ob2 is:"+ob2.t.isAlive());
		System.out.println("ob3 is:"+ob3.t.isAlive());
		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Error in Main class"+e);
		}
	}


}
