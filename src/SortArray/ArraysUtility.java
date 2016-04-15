package SortArray;

import java.util.Arrays;

/**
 * Created by amikhalnyuk on 15.04.2016.
 */
public class ArraysUtility {

    public static void main(String[] args) {

        double[] doubleArray = {1.2, 2.2, 3.5, -10.0, 5.0};

        Arrays.sort(doubleArray);

        for (double element : doubleArray) {
            System.out.println(element) ;

        }
    }
}
