public class ColorableInterfaceTest {
    public static void main(String[] args) {
        Shape[] arr=new Shape[3];
        arr[0]=new Circle(3);
        arr[1]=new Rectangle(2,3);
        arr[2]=new Square(5);

        for (Shape element:arr) {
            if (element instanceof Colorable){
                ((Colorable) element).howToColor();
//                System.out.println(element);
            }else
                System.out.println(element);
            }
        }
    }

