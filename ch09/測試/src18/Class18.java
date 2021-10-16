public class Class18 
{
   public static void main(String args[]) 
   {
	new CCircle(1) 
	{
	void show()
	{
	System.out.println("¶ê­±¿n="+radius*radius*pi);
	}
}
	   .show();
	}
   static class CCircle
   {
	   public double pi=3.14;
	   public double radius;
	   
	   public CCircle(double r)
	   {
		   radius=r;
	   }
   }
}
