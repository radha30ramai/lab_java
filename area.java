//write java program to find area of rectangule and square.
// Program for finding Area of Square and Rectangle

class Area
{
	public static void main(String args[])
	{
		int len = 20;
		int bre = 10;
		System.out.println("Length is : " +len);
		System.out.println("Breadth is : " +bre);
		int area_Of_Square = len * len;//to find area of rectangule
		int area_Of_Rectangle = len * bre;//to find area of square
		System.out.println("Area of Square is : " +area_Of_Square);
		System.out.println("Area of Rectangle is : " +area_Of_Rectangle);
	}
}