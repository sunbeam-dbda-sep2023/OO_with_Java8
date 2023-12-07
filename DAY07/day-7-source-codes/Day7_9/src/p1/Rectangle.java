package p1;

public class Rectangle extends BoundedShape
{
	int l,b;
	Rectangle()
	{
		super();
	}
	Rectangle(int x,int y,int l,int b)
	{
		super(x,y);
		this.l=l;
		this.b=b;
	}
	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", b=" + b + "]"+super.toString();
	}
	
	@Override
	void area() 
	{
		System.out.println("Area of Rectangle = "+(this.l * this.b));
		
	}
	
	
}
