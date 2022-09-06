import static org.junit.jupiter.api.Assertions.*;

class TestDobutok {

    @org.junit.jupiter.api.Test
    void dob () {
        Dobutok dobutok = new Dobutok();
        int actual = dobutok.dob( 2, 3 );
        int expected = 6;
        assertEquals( actual , expected );
    }
}