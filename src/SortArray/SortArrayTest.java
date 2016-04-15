package SortArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by amikhalnyuk on 15.04.2016.
 */
public class SortArrayTest extends SortArray {
    @org.junit.Test
    public void main ( ) throws Exception {


        @Test ( timeout = 1000 )
        public void SortArray ( ) {
            int[] a = { 0 , 2 , 1 };
            int[] b = { 0 , 1 , 2 };
            int[] d = SortArrayTest.SortArray ( a );
            if ( Arrays.equals ( b, d ) != true ) Assert.fail ( );
        }
    }

    private static int[] SortArray ( int[] a ) {
    }
}