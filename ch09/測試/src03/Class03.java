
// hw9_3,
class Caaa     //(c)���i�ŧi��public�A���]�t�bclass Caaa�̭�
{
	private int value;     //(d)�i����public�A�������OCaaa
	
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
		Caaa obj1=new Caaa();       //(b) public Caaa() ; public Caaa(int i)�Q�I�s
		Caaa obj2=new Caaa(12);
	}
}
