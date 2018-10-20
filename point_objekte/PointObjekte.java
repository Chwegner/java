package pointobjekte;

import java.awt.Point;

public class PointObjekte {

    public static void main(String[] args) {
        int x1 = 3;
        int x2 = 5;
        int y1 = 2;
        int y2 = 7;

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        if (p1.equals(p2)) {
            System.out.println("\nDie beiden Punkte sind gleich.");
        } else {
            System.out.println("\nDie beiden Punkte sind nicht gleich.");
        }

    }

}
