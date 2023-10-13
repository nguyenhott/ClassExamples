import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationTest {

    @Test
    void testTwoDivideTwoEqualsOne(){
        ArithmeticOperation ap = new ArithmeticOperation();
        assertEquals(1, ap.divide(2,2));
    }

    @Test
    void testSixDivideThreeNotEqualsFour(){
        ArithmeticOperation ap = new ArithmeticOperation();
        assertNotEquals(4, ap.divide(6,3));
    }

    @Test
    void testFourDivideZeroShouldThrowException(){
        ArithmeticOperation ap = new ArithmeticOperation();
        assertThrows(ArithmeticException.class, () -> ap.divide(4,0));
    }


}