package TestCases;

import org.example.urinals.urinals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {
    @Test
    public void Valid_String_Test0()
    {
        System.out.println("******** Manideep Nalluri == TEST ONE EXECUTED ********");
        urinals urinal=new urinals();
        String test="01000";
        assertTrue(urinal.validString(test));
    }
    @Test
    public void Valid_String_Test_1()
    {
        System.out.println("******** Manideep Nalluri == TEST TWO EXECUTED ********");
        urinals urinal=new urinals();
        String test="0111";
        assertFalse(urinal.validString(test));
    }
    @Test
    public void Valid_String_Test_2()
    {
        System.out.println("******** Manideep Nalluri == TEST THREE EXECUTED ********");
        urinals urinal=new urinals();
        assertTrue(urinal.validString(null));
    }
    @Test
    public void Valid_String_Test_3()
    {
        System.out.println("******** Manideep Nalluri == TEST FOUR EXECUTED ********");
        urinals urinal=new urinals();
        String test="1100";
        assertFalse(urinal.validString(test));
    }

    @Test
    public void cntUrinalsTest()
    {
        System.out.println("******** Manideep Nalluri == TEST FIVE EXECUTED ********");
        urinals urinal=new urinals();
        String test="10001";
        assertEquals(1,urinal.countUrinals(test));
    }

    @Test
    public void cntUrinalsTest_1()
    {
        System.out.println("******** Manideep Nalluri == TEST SIX EXECUTED ********");
        urinals urinal=new urinals();
        String test="00000";
        assertEquals(3,urinal.countUrinals(test));
    }

    @Test
    public void cntUrinalsTest_2()
    {
        System.out.println("******** Manideep Nalluri == TEST SEVEN EXECUTED ********");
        urinals urinal=new urinals();
        String test="01000";
        assertEquals(1,urinal.countUrinals(test));
    }

    @Test
    public void cntUrinalsTest_3()
    {
        System.out.println("******** Manideep Nalluri == TEST EIGHT EXECUTED ********");
        urinals urinal=new urinals();
        String test="011";
        assertEquals(-1,urinal.countUrinals(test));
    }









}

