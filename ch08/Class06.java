class CCircle 
{
   double pi=3.14;
   double radius;
   void show_periphery() 
   {
      System.out.println("periphery="+2*this.pi*this.radius);
   }
}
public class Class06
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();
      cir1.radius=3.0;
      cir1.show_periphery(); 
   }
}