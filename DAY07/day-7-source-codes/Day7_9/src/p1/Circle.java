package p1;

public class Circle extends BoundedShape
{
	int radius;
	Circle()
	{
		super();
	}
	Circle(int x,int y,int radius)
	{
		super(x,y);
		this.radius=radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]"+super.toString();
	}
	@Override
	void area() // overridden method // we are overriding the area() method
	{
		System.out.println("Area of Circle = "+(Math.PI * this.radius*this.radius));
	}
	
	

}
