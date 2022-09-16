public class Main{
    public static void Main(String[] args){
        GrapherPanel grapherpanel = new GrapherPanel();
        Point a = new Point(1,2);
        Point b = new Point(-1,-2);
        Line lineL = new Line(a,b);
        System.out.println(lineL);
        lineL.getMidpoint();
        grapherpanel.plotLine(lineL);
        //PerpSlope
        //midpoint
        double midX;
        double midY;
        midX= (a.x+b.x)/2;
        midY= (a.y+b.y)/2;
        System.out.println(midX+","+midY);
        Point mid = new Point(midX,midY);
        //line
        Point midPerpA = new Point (mid.x-a.y,mid.y-a.x);
        Point midPerpB = new Point (mid.x-b.y,mid.y-b.x);
        Line perpLine = new Line (midPerpA, midPerpB);
        /*
        //Line stuff
        lineL.getLength();
        lineL.getSlope();
        lineL.getMidpoint();
        lineL.getPerpSlope();
        
        //Point stuff
        a.getX();
        a.getY();
        b.getX();
        b.getY();
        */
        //GrapherPanel stuff
        grapherpanel.plotLine(perpLine);
        grapherpanel.plotLine(lineL);
        grapherpanel.plotPoint(a);
        grapherpanel.plotPoint(b);
        
    }
}