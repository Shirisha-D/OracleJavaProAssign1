
public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test1 t1;
Test2 t2;
Test3 t3;
Test4 t4;
Test5 t5;
t1=new Test1();
t2=new Test2();
t3=new Test3();
t4=new Test4();
t5=new Test5();
System.out.println("---------------");
System.out.println("Test1.java output");
t1.smallAlpha();
t1.capAlpha();
t1.display();
System.out.println("---------------");
System.out.println("Test2.java output");
t2.addition(10,20);
t2.subtraction(20,10);
t2.multiplication(20,10);
System.out.println("---------------");
System.out.println("Test3.java output");
t3.circleArea(10);
t3.circlePerimeter(10);
t3.display();
System.out.println("---------------");
System.out.println("Test4.java output");
t4.rectangleArea(20,10);
t4.RectanglePerimeter(20, 10);
t4.display();
System.out.println("---------------");
System.out.println("Test5.java output");
t5.display1();
t5.display2();
t5.display3();
	}

}
