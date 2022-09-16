public class Point{
    double x;
    double y;
    
    Point(double _x, double _y){
        x = _x;
        y = _y;
    }
    public double getX(){
        System.out.println("x:"+x);
        return x;
    }
    public double getY(){
        System.out.println("y:"+y);
        return y;
    }
    public String toString () {
        return "(" + x +","+ y + ")";
    }   
}
