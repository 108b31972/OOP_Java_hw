import java.io.*;
public class Class06 
{
	public static void main(String args[])
	{
	   try
	   {
	   char data[]=new char[128];
	   InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\Java\\train.txt"), "UTF-8");
	
	   int num=isr.read(data);
	   String str=new String(data,0,num);
	   System.out.println("Characters read= "+num);
	   System.out.println(str);
	   isr.close();
	   }
	   catch(IOException e)
	   {
	   }
    }
}
