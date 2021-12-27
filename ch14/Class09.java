import java.io.*;

public class Class09
{
public static void main(String args[]) throws IOException
{
	InputStreamReader isr1=new InputStreamReader(new FileInputStream("D:\\Java\\aaa.txt"), "UTF-8");
	InputStreamReader isr2=new InputStreamReader(new FileInputStream("D:\\Java\\bbb.txt"), "UTF-8");
	InputStreamReader isr3=new InputStreamReader(new FileInputStream("D:\\Java\\ccc.txt"), "UTF-8");
    BufferedReader bfr1=new BufferedReader(isr1);
    BufferedReader bfr2=new BufferedReader(isr2);
    BufferedReader bfr3=new BufferedReader(isr3);
    String str;
    
    System.out.println("aaa.txt");
    while((str=bfr1.readLine())!=null)
    System.out.println(str);

    System.out.println("bbb.txt");
    while((str=bfr2.readLine())!=null)
    System.out.println(str);
    
    System.out.println("\nccc.txt");
    while((str=bfr3.readLine())!=null)
    System.out.println(str);

    isr1.close();
    isr2.close();
    isr3.close();
    }
}