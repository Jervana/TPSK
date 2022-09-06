import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSum_Min {

    @Test
    void sum_min () {
        Sum_Min sum_min = new Sum_Min();
        int actual = sum_min.sum_min( 7 , 8 );
        int expected = 15;
        assertEquals( actual , expected );
    }
}