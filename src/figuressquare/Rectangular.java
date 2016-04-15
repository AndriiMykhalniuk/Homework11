package figuressquare;

/**
 * Created by amikhalnyuk on 18.03.2016.
 */
public class Rectangular extends Figures {
    double topside, bottomside, leftside, rigthside;

    Rectangular ( double side1, double side2 ) {
        this.bottomside = this.topside = side1;
        this.leftside = this.rigthside = side2;
    }

    @Override
    double getSquare () {
        return (this.topside*this.leftside);
    }

    @Override
    String getName () {
        return "Rectangular";
    }
}
