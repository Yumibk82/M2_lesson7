public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle();
        System.out.println(circle);

        circle = new Circle("yellow", true, 3.5);
        System.out.println(circle);
    }
}