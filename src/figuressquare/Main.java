package figuressquare;

/**
 * Created by amikhalnyuk on 18.03.2016.
 */
public class Main {
    public static void main ( String[] args ) {
        Figures regt = new Rectangular ( 4.0, 4.0 );
        System.out.println (regt.getName ()+ " square: "+regt.getSquare ());
        Figures circle = new Circle ( 8.0 );
        System.out.println (circle.getName ()+ " square: "+circle.getSquare ());
        Figures triangle = new Triangle ( 8.0, 16.0 );
        System.out.println (triangle.getName ()+ " square: "+triangle.getSquare ());
    }
}
