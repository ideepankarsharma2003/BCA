import java.util.Scanner;

class _01methodOverloading {
    public static void area(int a) {
        System.out.println("The area of square is: " + (a * a));
    }

    public static void area(int a, int b) {
        System.out.println("The area of rectangle is: " + (a * b));
    }

    public static void area(float a) {
        System.out.println("The area of circle is: " + (3.14 * a * a));
    }

    public static void main(String[] args) {
        int choice;
        System.out.print("\n(1. Square)\n(2. Rectangle)\n(3. Circle)\nEnter your choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
        case 1:
            int sside;
            System.out.print("Enter the side of the square: ");
            sside = sc.nextInt();
            area(sside);
            break;

        case 2:
            int r1side, r2side;
            System.out.print("Enter the length of the rectangle: ");
            r1side = sc.nextInt();
            System.out.print("Enter the breadth of the rectangle: ");
            r2side = sc.nextInt();
            area(r1side, r2side);
            break;

        case 3:
            float radius;
            System.out.print("Enter the radius of the circle: ");
            radius = sc.nextFloat();
            area(radius);
            break;

        default:
            break;
        }

        sc.close();
    }
}