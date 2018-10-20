package point2;

import java.awt.Point;
import java.awt.Rectangle;

public class Point2 {

    public static void main(String[] args) {

        //Aufgabe 1:
        System.out.println("\n\033[0;1m" + "Aufgabe 1:\n");

        int x1 = 10;
        int y1 = 10;
        int x2 = 30;
        int y2 = 30;

        Point pt1 = new Point(x1, y1);
        Point pt2 = new Point(x2, y2);
        Rectangle rect = new Rectangle(pt1);
        rect.add(pt2);
        int height = (int) Math.abs(rect.getHeight());
        int width = (int) Math.abs(rect.getWidth());
        System.out.println("Die Flaeche betraegt: " + height * width + "\n");

        // Aufgabe 2:  
        System.out.println("\033[0;1m" + "Aufgabe 2:\n");
        Point ptAlias = pt1;

        if (ptAlias == pt1) {
            System.out.println("pt1 und ptAlias verweisen auf dasselbe Objekt!\n");
        }
        System.out.println("Point pt1 vorher:\t" + pt1.toString());
        System.out.println("Point ptAlias vorher:\t" + ptAlias.toString());

        System.out.println("\nNur von ptAlias wurden x und y verdoppelt!");
        ptAlias.setLocation(ptAlias.getX() * 2, ptAlias.getY() * 2);

        System.out.println("\nPoint pt1 nachher:\t" + pt1.toString());
        System.out.println("Point ptAlias nachher:\t" + ptAlias.toString() + "\n");

    }

}
