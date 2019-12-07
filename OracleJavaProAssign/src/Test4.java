
public class Test4 {
	static void rectangleArea(int length, int breadth){
        //Calculate Rectangle Area.
int area = length * breadth;
        //Print Rectangle Area.
        System.out.println("Rectangle area: " + area);
}
	static void RectanglePerimeter(int length,int breadth)
	{
		
			  int perimeter = 2 * (length + breadth);
	                  //Print Rectangle Area.
	                  System.out.println("Rectangle Perimeter: " + perimeter);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangleArea(20, 30);
		RectanglePerimeter(10,5);
	}

}
