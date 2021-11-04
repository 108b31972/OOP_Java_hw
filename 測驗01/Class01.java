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
		System.out.println("半徑=10 球形體積="+Cal_area(10))	;
		System.out.println("長=4,寬=5,高=6 立方體表面積="+Cal_area(4,5,6));

	}

}
