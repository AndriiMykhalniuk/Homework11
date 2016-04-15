package figuressquare;

/**
 * Created by amikhalnyuk on 18.03.2016.
 */
public class Circle extends Figures {
    double radius;
    Circle (double radius ) {

        this.radius=radius;
    }
    @Override
    double getSquare () {
        return Math.PI*radius;
    }

    @Override
    String getName () {
        return "Circle";
    }
}
