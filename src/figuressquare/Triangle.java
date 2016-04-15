package figuressquare;

/**
 * Created by amikhalnyuk on 18.03.2016.
 */
public class Triangle extends Figures {
    double triangleside, altitude;

    Triangle ( double triangleside, double altitude ) {
        this.triangleside=triangleside;
        this.altitude=altitude;

    }

    @Override
    double getSquare () {
        return 0.5*triangleside*altitude;
    }

    @Override
    String getName () {
        return "Triangle";
    }
}
