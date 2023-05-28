class Point{
	private int x , y;
	public Point (int x , int y)
	{
		this.x = x;
		this.y = y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void move(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class ColorPoint2 extends Point {
	private String color;
	public ColorPoint2(int x, int y)
	{
		super(0,0);
		color = "BLACK";
	}
	public void setXY(int x , int y)
	{
		move(x,y);
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String toString()
	{
		return color + "색의(" + getX() + "," + getY() + ")의 점";
	}

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2(0,0);
		System.out.println(zeroPoint.toString() + "입니다");
		
		ColorPoint2 cp = new ColorPoint2(10,10); // (10,10) 위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
		

	}

}
