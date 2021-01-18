public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(){

    }
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius, String color,boolean filled){
        super(radius,color,filled);
    }

    public int CompareTo(ComparableCircle o){
        if(getRadius()>o.getRadius()) return -1;
        else return 1;
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return 0;
    }
}
