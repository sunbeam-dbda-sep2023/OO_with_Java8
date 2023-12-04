package p1;

public class Faculty 
{
	String name;
	int fid;

	public Faculty()
	{
		
	}
	public Faculty(String name,int fid)
	{
		this.name=name;
		this.fid=fid;
	}
	
	public String toString()
	{
		return "Name = "+this.name+" Faculty ID = "+this.fid;
	}
}
