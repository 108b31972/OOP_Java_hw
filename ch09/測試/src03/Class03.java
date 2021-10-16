
// hw9_3,
class Caaa     //(c)不可宣告成public，須包含在class Caaa裡面
{
	private int value;     //(d)可換成public，成員都是Caaa
	
	public Caaa()
	{
		value=10;     //(a)
		System.out.println("value="+value);	
}
	public Caaa(int i)
	{
		value=i;
		System.out.println("value="+value);		
	}
}	
public class Class03 
{
	public static void main(String[] args) 
	{
		Caaa obj1=new Caaa();       //(b) public Caaa() ; public Caaa(int i)被呼叫
		Caaa obj2=new Caaa(12);
	}
}
