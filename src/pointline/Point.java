package pointline;

/**
 * Created By Arshak on Dec, 2020
 */
public class Point {

    private double x;
    private double y;

    public Point(double x,double y){
        setX(x);
        setY(y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString(){
        return String.format("(%f,%f",x,y);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null ||!(obj instanceof Point)){
            return false;
        }
        Point newPoint = (Point) obj;
        return x == newPoint.getX()&& y == newPoint.getY();
    }
}
