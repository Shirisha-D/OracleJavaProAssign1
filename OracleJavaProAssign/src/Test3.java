
public class Test3 {
	static void circleArea(int radius){
		 double area = Math.PI * radius * radius;
        //Print Circle Area.
        System.out.println("Circle area: " + area);
	}
	
	static void circlePerimeter(int radius){
		 //Calculate Circle Perimeter.
		 double perimeter = 2 * Math.PI * radius;
                //Print Circle Area.
                System.out.println("Circle perimeter: " + perimeter);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
circleArea(10);
circlePerimeter(20);
	}

}
