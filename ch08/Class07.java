class CTest
{
    int x;
    void test(int x)
{
    if(x%2==1)
    	System.out.println("���Ƭ��_��");
    else if (x==0)
    	System.out.println("���Ƭ�0");
    else if(x%2==0)
    	System.out.println("���Ƭ�����");
}
}
    public class Class07 
	{
       public static void main(String[] args)
    {
    CTest c=new CTest();
	System.out.println("test(3)");
	c.test(3);
	System.out.println("test(8)");
	c.test(8);
	System.out.println("test(0)");
	c.test(0);
    }	
  }