package javaday2;
class Shape
{
	public double length;
	public double area;
	int display();
}
class Circle extends Shape
{
	int display()
	{
		area=3.14*length*length;
		System.out.println(" ");
	}
}
class Triangle extends Shape
{
	public int height;
	int display()
	{
		area=length*height;
		System.out.println(" ");
	}
}
class Rectangle extends Shape
{
	public int breadth;
	public int height;
	int display()
	{
		area=breadth*length*height;
		System.out.println(" ");
	}
}
class Square extends Shape
{
	int display()
	{
		area=length*length;
		System.out.println(" ");
	}
}
public class Test {

}
