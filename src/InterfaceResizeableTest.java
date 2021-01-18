import java.util.Arrays;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle("yellow",true,3);
        arr[1] = new Rectangle(3,2);
        arr[2] = new Square(5);

        System.out.println("Before resize "+ Arrays.toString(arr));

        System.out.println("after");

        for (Shape element:arr) {
            element.resize(Math.random()*((100-1)+1));
            System.out.println(element);
        }

//        for (Shape element:arr) {
//            if(element instanceof Circle){
//                Circle c=(Circle) element;
//                System.out.println(c.getArea());
//            }else if (element instanceof Rectangle){
//                Rectangle r=(Rectangle) element;
//                System.out.println(r.getArea());
//            }else if(element instanceof Square){
//                Square s=(Square) element;
//                System.out.println(s.getArea());
//            }
//        }
//        System.out.println("After resize ");
//        for (Shape element:arr) {
//            if (element instanceof Circle) {
//                Circle c = (Circle) element;
//                c.resize(Math.random());
//
//                System.out.println(c.getArea());
//            } else if (element instanceof Rectangle) {
//                Rectangle r = (Rectangle) element;
//                r.resize(Math.random());
//
//                System.out.println(r.getArea());
//            } else if (element instanceof Square) {
//                Square s = (Square) element;
//                s.resize(Math.random());
//                System.out.println(s.getArea());
//            }
        }
        }



