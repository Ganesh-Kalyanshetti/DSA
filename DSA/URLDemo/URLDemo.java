import java.net.*;
class URLDemo
{
	public static void main(String args[]) throws MalformedURLException
	{
		URL hp = new URL("https://msrit.edu/department/aerospace.html");
		System.out.println("Protocal-"+hp.getProtocol());
		System.out.println("Port-"+hp.getPort());
        System.out.println("Protocal-"+hp.getHost());
        System.out.println("Protocal-"+hp.getFile());
        System.out.println("Ext-"+hp.toExternalForm());
        
	}
}
