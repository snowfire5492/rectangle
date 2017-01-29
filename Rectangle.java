public class Rectangle
{
	private int length;
	private int width;
	
	public Rectangle(int l, int w)
	{
		length = l;
		width = w;
	}
	
	public String toString()
	{
		String result = ("length: " + length + ", width: " + width);
		return result;
	}
	

	public static void main(String[] args)
	{
		Rectangle[] test = new Rectangle[4];
		
		test[0] = new Rectangle(4,2);
		test[1] = new Rectangle(3,5);
		test[2] = new Rectangle(5,7);
		test[3] = new Rectangle(8,6);
		
		for ( int j=0; j<test.length; j++ )
      System.out.println( test[j].toString() );
	}

}