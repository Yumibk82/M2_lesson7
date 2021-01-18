import com.sun.xml.internal.ws.encoding.MtomCodec;

public class Circle extends Shape implements Resizeable{
    private double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double radius;
    public Circle(){

    }
    public Circle(String color,boolean filled,double radius){
        super(color,filled);
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public void resize(double percent) {
        radius=radius*percent;
    }
}
