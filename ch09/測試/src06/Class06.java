class bbb
{
	public static void add2n(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
		System.out.println("1+2+...+"+n+"="+sum);
	}
}
public class Class06 
{
public static void main(String[] args)
{
	bbb.add2n(5);
	bbb.add2n(10);
    }
}

