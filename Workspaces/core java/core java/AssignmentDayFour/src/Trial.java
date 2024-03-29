import java.util.function.Consumer;

interface Polygon
{
	 public double calArea();
	 public double calPeri();
}
class Triangle implements Polygon 
{
	private int height,base,s1,s2,s3;

	public Triangle() {
		super();
		base=height=s1=s2=s3=1;
	}
	public double calArea()
	{
		return 0.5*base*height;
	}
	public double calPeri()
	{
		return s1+s2+s3;
	}
}
class Rectangle implements Polygon
{
     private int len,bre;
     public Rectangle()
     {
    	 bre=len=1;
     }
     
     public Rectangle(int len, int bre) {
		super();
		this.len = len;
		this.bre = bre;
	}

	public double calArea()
 	{
 		return len*bre;
 	}
 	public double calPeri()
 	{
 		return 2*len*bre;
 	}
     
}
class Square extends Rectangle
{
	public Square()
	{
		super();
	}
	public Square(int s)
	{
		super(s,s);
	}
	 public double calArea()
	 	{
	 		return super.calArea();
	 	}
	 	public double calPeri()
	 	{
	 		return super.calPeri();
	 	}
}
public class Trial {
	public static void main(String args[]) {
		Polygon square=new Square(10);
		System.out.println(square.calArea());
		System.out.println(square.calPeri());
	}

}
