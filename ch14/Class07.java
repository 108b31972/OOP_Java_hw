import java.io.*;

public class Class07 {

	public static void main(String[] args) throws IOException 
	{
		int count=0;
		String str;
		InputStreamReader isr=new InputStreamReader(new FileInputStream("D:\\Java\\donkey.txt"), "UTF-8");
		BufferedReader bfr=new BufferedReader(isr);
		
		while((str=bfr.readLine())!=null)
		{
		if(count==1)
		bfr.skip(14);
		System.out.println(str);
		count++;
		}
		isr.close();
		}
		}
