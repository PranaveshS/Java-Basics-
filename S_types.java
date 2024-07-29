import java.util.Scanner;

class shape
{
	static void rectangle()
	{
		System.out.println("Area of rectangle is Length x Breadth");
	}
	
	static void circle()
	{
		System.out.println("Area of circle is Pi x Radius x Radius");
	}

	static void triangle()
	{
		System.out.println("Area of triangle is 1/2 x Base x Height");
	}

	static void square()
	{
		System.out.println("Area of square is Side x Side");
	}
}

class S_types
{
	public static void main(String args[])
	{
		shape sh=new shape();
		sh.rectangle();
		sh.circle();
		sh.triangle();
		sh.square();
	}
}