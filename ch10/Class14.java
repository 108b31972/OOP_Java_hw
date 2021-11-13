class Cccc{
	public int num1;
	public int num2;
	public Cccc() {
		num1=1;
		num2=1;
	}
	public Cccc(int a,int b) {
		num1=a;
		num2=b;
	}
}
class Cddd extends Cccc{
	public Cddd(int a,int b) {
    super(a,b);
	}
	public void show() {
		System.out.println("num1="+num1+" ,num2="+num2);
	}
}	
public class Class14 {

	public static void main(String[] args) {		
		Cddd d2 = new Cddd(0,1);		
		d2.show();
	}

}
