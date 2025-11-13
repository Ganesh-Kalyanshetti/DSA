import java.net.*;
import java.io.*;
class Soc
{
    public static void main(String args[]) throws Exception
    {
        int c;
	Socket s = new Socket("whois.internic.net",43);
	
	
        InputStream in = s.getInputStream();
        OutputStream O = s.getOutputStream();
        String str = (args.length == 0 ?"msrit.edu":args[0]);
	str +="\r\n";
        byte buf[] = str.getBytes();
        O.write(buf);
        while((c=in.read())!=-1)
        {
            System.out.print((char) c);
        }
	
    }
}
