import java.io.*;
public class Class08
{
public static void main(String args[]) throws IOException
{
	InputStreamReader isr1=new InputStreamReader(new FileInputStream("D:\\Java\\aaa.txt"), "UTF-8");
	InputStreamReader isr2=new InputStreamReader(new FileInputStream("D:\\Java\\bbb.txt"), "UTF-8");
	FileWriter fw=new FileWriter("D:\\java\\ccc.txt");
    BufferedReader bfr1=new BufferedReader(isr1);
    BufferedReader bfr2=new BufferedReader(isr2);
    BufferedWriter bfw=new BufferedWriter(fw);
    String str;

    while((str=bfr1.readLine())!=null)
    {
    bfw.write(str);
    bfw.newLine();
    }

    while((str=bfr2.readLine())!=null)
    {
    bfw.write(str);
    bfw.newLine();
    }

    bfw.flush();
    fw.close();
    isr1.close();
    isr2.close();
    }
}
