package p1;

public interface Printer 
{
	int data = 1234;
	// compiler implicitly adds , public static final for field
	
	void print(String msg);
	// for methods : compiler implicitly adds public abstract
	
}
