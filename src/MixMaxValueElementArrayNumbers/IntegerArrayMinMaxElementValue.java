package MixMaxValueElementArrayNumbers;

import java.util.Arrays;

/**
 * Created by amikhalnyuk on 15.04.2016.
 */
public class IntegerArrayMinMaxElementValue {

    public static void main (String[] args) {

        ComputeMinMaxValueElementOfArray computeMinMaxValueElementOfArray = new ComputeMinMaxValueElementOfArray();
        int[] value1 = ComputeMinMaxValueElementOfArray.value1;
        System.out.println (Arrays.toString (value1));
        computeMinMaxValueElementOfArray.getMin ();
        computeMinMaxValueElementOfArray.getMax ();
    }
}

class ComputeMinMaxValueElementOfArray {

    static int[] value1 = {-234, 7, 9, 18, 21, 64, 256, 1019, 248, 15, 6, 18, -1019};
    int min = 0, max = 0;

    public Integer getMin () {
        System.out.println ();
        computeMinElementOfArray(value1);
        return min;
    }

    public Integer getMax () {
        System.out.println ();
        computeManElementOfArray(value1);
        return max;
    }

    public Integer computeMinElementOfArray (int[] value1) {
        int value[] = value1;
        int m = value[0];
        for (int i = 0; i <= value.length - 1; i++) {
            if (m > value1[i]) m = value[i];
        }
        System.out.print ("\n" + "Minimal Element Value = " + m);
        return m;
    }

    public int computeManElementOfArray (int[] value1) {
        int value[] = value1;
        int m = value[0];
        for (int i = 0; i <= value.length - 1; i++) {
            if (m < value[i]) m = value[i];
        }
        System.out.print ("\n" + "Maximum Element Value = " + m);
        return m;
    }

}
