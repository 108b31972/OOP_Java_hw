public class Class01 {
	static double Cal_area(double r) 
	{
		return 4*(Math.PI*r*r*r)/3;
	}
	static double Cal_area(double length, double width, double height) 
	{
		return 2*(length*width+width*height+height*length);
	}
	public static void main(String[] args) {
		System.out.println("�b�|=10 �y����n="+Cal_area(10))	;
		System.out.println("��=4,�e=5,��=6 �ߤ�����n="+Cal_area(4,5,6));

	}

}
