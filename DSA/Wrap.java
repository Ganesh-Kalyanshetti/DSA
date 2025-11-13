class Wrap
{
	static int m(Integer h)
	{
		return h;
	}
	public static void main(String args[])
	{
		//Integer iob = new Integer(100);
		//int i = iob.intValue();
		//System.out.println(i+" "+iob);
		
		Integer iob = 100;
		int i = iob;
		System.out.println(i+" "+iob);

		Integer Iob = m(200);
		System.out.println(Iob);
		
	}
}
