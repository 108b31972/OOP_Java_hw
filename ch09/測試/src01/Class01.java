class CRectangle
{
	int width;
	int height;
    public CRectangle(int w,int h)
{
    width=w;
    height=h;		
    System.out.println("constructor CRectangle(int w,int h) named");
}  
    public  CRectangle()
{
    	width=10;         //(c)this(10,8) 
    	height=8;        
    	System.out.println("constructor CRectangle() named");
}
    public void aaa()
    {
    	System.out.println("width="+width);
    	System.out.println("height="+height);
    }
}
    
public class Class01 
     {
     public static void main(String[] args) 
     {
		CRectangle CRec=new CRectangle(0,0);
		CRec.aaa();
		CRectangle CRec1=new CRectangle();
		CRec1.aaa();		
	}

}
