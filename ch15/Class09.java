class CTest extends Thread implements Runnable
{
  private String id;
  private int sec;
  public CTest(String str,int s)
  {
     id=str;
     sec=s;
  }
  public void run()
  {
    for(int i=0;i<10;i++)
    {
       try
    {
       sleep(sec);
    }
    catch(InterruptedException e)
    {    	
    }
    System.out.println(id+" is running..");
   }
   }
}

public class Class09
{
   public static void main(String args[])
   {
	   CTest hi=new CTest("Hello");
	   CTest bye=new CTest("Good bye");
	   CTest morning=new CTest("Good morning");
	   CTest night=new CTest("Good night");
	   Thread t1=new Thread(hi);
	   Thread t2=new Thread(bye);
	   Thread t3=new Thread(morning);
	   Thread t4=new Thread(night);
	   t1.start();
	   t2.start();
	   t3.start();
	   t4.start();
	}
}

