import java.util.Scanner;


interface Shape {
    abstract void area();
    
}

class Circle implements Shape{
    float a, ar;
    Circle(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        a=sc.nextFloat();
        area();
    }
    public void area(){
        ar= 3.142f*a*a;
        System.out.println("The area of the circle is: "+ ar + "\n\n");
    }
}

class Rectangle implements Shape{
    float a, b, ar;
    Rectangle(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        a=sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        b=sc.nextFloat();
        area();
    }
    public void area(){
        ar= b*a;
        System.out.println("The area of the rectangle is: "+ ar+ "\n\n");
    }
}

class Triangle implements Shape{
    float a, b, ar;
    Triangle(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        a=sc.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        b=sc.nextFloat();
        area();
    }
    public void area(){
        ar= 0.5f*b*a;
        System.out.println("The area of the triangle is: "+ ar+ "\n\n");
    }
}

/**
 * _01_Area_Using_Interface
 */
public class _01_Area_Using_Interface {
    
    public static void main(String[] args) {
        Circle obj1= new Circle();
        Rectangle obj2= new Rectangle();
        Triangle obj3= new Triangle();
    }
}