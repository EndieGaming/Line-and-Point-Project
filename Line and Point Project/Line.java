import java.lang.Math;
public class Line{
    Point a;
    Point b;

    Line(Point _a, Point _b){
        a = _a;
        b = _b;
    } 

    Point getPointA(){
        return a;
    }

    Point getPointB(){
        return b;
    }

    double getSlope(){
        System.out.println("slope:"+(a.y-b.y)/(a.x-b.x)); 
        return (a.y-b.y)/(a.x-b.x);
    }

    double getLength(){
        System.out.println("length:"+Math.sqrt(((a.x-a.y)*(a.x-a.y))+((a.y-b.y)*(a.y-b.y))));
        return Math.sqrt(((a.x-a.y)*(a.x-a.y))+((a.y-b.y)*(a.y-b.y)));
    }
    
    Point getMidpoint(){
        double midX;
        double midY;
        midX= (a.x+b.x)/2;
        midY= (a.y+b.y)/2;
        System.out.println("midpoint:"+midX+","+midY);
        Point mid = new Point(midX,midY);
        return mid;
    }

    double getPerpSlope(){
        System.out.println("perpslope"+(-1/((a.y-b.y)/(a.x-b.x))));
        return -1/((a.y-b.y)/(a.x-b.x));
    }
    
    Line getPerpBisector(){
        //midpoint
        double midX;
        double midY;
        midX= (a.x+b.x)/2;
        midY= (a.y+b.y)/2;
        System.out.println(midX+","+midY);
        Point mid = new Point(midX,midY);
        //line
        Point midPerpA = new Point ((mid.x-a.y),(mid.y-a.x));
        Point midPerpB = new Point ((mid.x-b.y),(mid.y-b.x));
        Line perpLine = new Line (midPerpA, midPerpB);
        
        return perpLine;
    }
    
    public String toString(){
        return "(" + a.x + "," + a.y + ")" + "->" + "(" + b.x + "," + b.y + ")";
    }
}
