package MixMaxValueElementArrayNumbers;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

/**
 * Created by amikhalnyuk on 15.04.2016.
 */
public class IntegerArrayMinMaxElementValueTest {
    @Test
    public void main ( ) throws Exception {

        ComputeMinMaxValueElementOfArray s;

        @Rule
        public Timeout time = new Timeout ( 1000 );

        @BeforeClass
        public static void setUpClass ( )throws Exception {
            s = new ComputeMinMaxValueElementOfArray ( );
            System.out.println ( "\nsetUpClass method called!\n" );
        }

        @org.junit.Test
        public void testFindMinElementOfArray ( )throws Exception {
            int exp = - 999;
            assertEquals ( exp, s.computeMinElementOfArray ( s.value1 ), 0 );
        }

        @org.junit.Test
        public void testFindMaxElementOfArray ( )throws Exception {
            int exp = 12;
            assertEquals ( exp, s.computeManElementOfArray ( s.value1 ), 0 );
        }
    }
}