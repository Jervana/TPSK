import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @org.junit.jupiter.api.Test
    void sum () {
        Numbers numbers = new Numbers();
        int actual = numbers.sum( 10 );
        int expected = 3;
        assertEquals( expected,actual);
    }
}