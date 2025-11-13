enum Apple 
{

	Johnathan(100),Golden_Del(200),reddel(300),winesap(400);

private int price;
Apple(int p)
{
	price=p;
}
int getprice()
{
	return price;
}
}


class EnumDemo3
{
	public static void main(String args[])
	{
		System.out.println("Price of Johnathan is :"+Apple.Johnathan.getprice());
		System.out.println("Price of all Apple is :");	
		for(Apple a:Apple.values())
		{
			System.out.println(a+" price is "+a.getprice());
		}	
		
	}

}
