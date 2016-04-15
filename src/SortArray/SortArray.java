package SortArray;

/**
 * Created by amikhalnyuk on 15.04.2016.
 */
public class SortArray {

    public static void main(String[] args) {

        double[] doubleArray = {4, 1.2, 2.2, 3.5, -10.0, 5.0};

        boolean swapOccurred = true;

        while (swapOccurred) {

            swapOccurred = false;
            for (int i = 0; i < doubleArray.length - 1; i++) {
                if (doubleArray[i] > doubleArray[i + 1]) {
                    double tempVarible = doubleArray[i];

                    doubleArray[i] = doubleArray[i + 1];
                    doubleArray[i + 1] = tempVarible;

                    swapOccurred = true;
                }
            }
        }
        for (double element : doubleArray) {
            System.out.println(element) ;

        }
    }
}
