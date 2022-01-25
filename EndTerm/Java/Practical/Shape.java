public class Shape {
    public static void main(String[] args) {
        Circle c= new Circle() {
            public void draw(){
                System.out.println("Draw Circle");
            }

            public void erase() {
                System.out.println("Erase Circle");
            }
        };
        c.draw();
        c.erase();

        Square s= new Square() {
            public void draw(){
                System.out.println("Draw Square");
            }

            public void erase() {
                System.out.println("Erase Square");
            }
        };
        s.draw();
        s.erase();

        Triangle t= new Triangle() {
            public void draw(){
                System.out.println("Draw Triangle");
            }

            public void erase() {
                System.out.println("Erase Triangle");
            }
        };
        t.draw();
        t.erase();
    }
}
