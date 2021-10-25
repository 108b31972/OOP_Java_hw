class CBox
      {
		   int length=1;     //(a)
		   int width=1;
		   int height=1;	
		   void volume()     //(b)
		   {
		       System.out.println("volume="+length*width*height);
		   }
		   void surfaceArea()      //(c)
		   {
			   System.out.println("surfaceArea="+(length*width)*2+(length*height)*2+(width*height)*2);    
		   }
           void showData()     //(d)
           {
        	   System.out.println("length="+length);
        	   System.out.println("width="+width);
        	   System.out.println("height="+height);
           }
           void showAll()     //(e)
           {
        	   System.out.println("volume="+length*width*height);
        	   System.out.println("surfaceArea="+(length*width)*2+(length*height)*2+(width*height)*2);
        	   System.out.println("length="+length);
        	   System.out.println("width="+width);
        	   System.out.println("height="+height);
           }
	   }
	   public class Class05
	       {
           public static void main(String[] args) 
	       {
		   CBox box=new CBox();     
           box.volume();
           box.surfaceArea();
           box.showData();
           box.showAll();
	}

}
