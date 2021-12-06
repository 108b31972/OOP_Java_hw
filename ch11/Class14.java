interface iVolume
{
  public void showData(); 
  public double vol(); 
}
abstract class CSphere implements iVolume
{
  final double PI=3.14;
  protected int x;
  protected int y;
}
class CCircle extends CSphere
{
   protected double radius;
   public CCircle(int a, int b,int r)
   {
	   	x=a;
	   	y=b;
	   	radius=r;
   }
   public void showData()
   {
	   System.out.println("�y��:(+x,+y)"); 
	   System.out.println("�b�|:"+radius);
	   System.out.println("�y��n:"+vol());
   }
   public double vol()
   {
	   return(4*(radius*radius*radius*PI)/3);
   }
}
public class Class14
{
   public static void main(String args[])
   {
     CCircle cir=new CCircle(8,6,2);
     cir.showData();
   }
}
