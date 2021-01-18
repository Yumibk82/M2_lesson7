public class ColorableInterfaceTest {
    public static void main(String[] args) {
        Shape[] arr=new Shape[3];
        arr[0]=new Circle(3);
        arr[1]=new Rectangle(2,3);
        arr[2]=new Square(5);

        for (Shape element:arr) {
            if(element instanceof Circle){
                Circle c=(Circle) element;
                System.out.println(c.getArea());
            }else if(element instanceof Square){
                Square s=(Square) element;
                s.howToColor();
                System.out.println(s.getArea());
            }else if(element instanceof Rectangle){
                Rectangle r=(Rectangle) element;
                System.out.println(r.getArea());
            }
        }
    }
}
