import java.util.Scanner;
public class _05_classRectangle {
    double area;
    double length;
    double breadth;
    _05_classRectangle(float l, float b){
        length=l;
        breadth=b;
        area=length*breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        float breadth = sc.nextFloat();
        _05_classRectangle obj= new _05_classRectangle(length, breadth);
        System.out.println("The area of rectangle is: " + String.format("%.4f",obj.area));
        sc.close();
    }
}
