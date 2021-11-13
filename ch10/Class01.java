class Caaa{
	public int num1;
	public int num2;
	public void show() {
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);		
	}
}
class Cbbb extends Caaa{
	public void set_sum(int x,int y) {
		num1=x;
		num2=y;
	}
}
public class Class01 {

	public static void main(String[] args) {
		Cbbb bb = new Cbbb();
		bb.set_sum(5, 10);
		bb.show();

	}

}
