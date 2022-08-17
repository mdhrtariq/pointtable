package pointtable;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        Point point1= new Point(1,1);
        Point point2= point1;
        Point point3= point2;
        point1.x=10;
        point1.y=3;

        System.out.println(point1);
    }
}