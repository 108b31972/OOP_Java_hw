class Cccc{
	public int num1;
	public int num2;
	public Cccc() {
		num1=1;
		num2=1;
	}
}
class Cddd extends Cccc{
	public Cddd() 
	{		
    super();
    }
	public void show() {
		System.out.println("num1="+num1+" ,num2="+num2);
	}
}	
public class Class13 {

	public static void main(String[] args) {
		Cddd d1 = new Cddd();
		d1.show();
	}

}