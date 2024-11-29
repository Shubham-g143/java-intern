/*  Write java code to read 3 sides of triangle and display what type of triangle it is   */

class triangle
{
	public static void main(String[] args)
	{
		int a=4,b=3,c=2;
		if(a==b && b==c)
		{
			System.out.println("equilatorial Triangle");
		}
		else if(a==b || a==c || b==c)
		{
			System.out.println("Isocelous Triangle");
		}
		else
		{
			System.out.println("Scalar Triangle");
		}
	}
}