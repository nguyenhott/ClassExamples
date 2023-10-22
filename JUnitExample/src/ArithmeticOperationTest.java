import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationTest {

    @Test
    void testTwoDivideTwoEqualsOne(){
        ArithmeticOperation ap = new ArithmeticOperation();
        double actualValue = ap.divide(2,2);
        assertEquals(1, actualValue);
    }

    @Test
    void testSixDivideThreeEqualsTwo(){
        ArithmeticOperation ap = new ArithmeticOperation();
        assertEquals(2, ap.divide(6,3));

    }

    @Test
    void testFourDivideZeroShouldThrowException(){
        ArithmeticOperation ap = new ArithmeticOperation();
        assertThrows(ArithmeticException.class, () -> ap.divide(4,0));
    }


}