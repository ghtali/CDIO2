package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import spil.Dice;

public class DiceTest {
    Dice terning;
    private final int MAX = 6;

    @Before
    public void setUp() throws Exception {
        terning = new Dice();
    }

    @After
    public void tearDown() throws Exception {
        terning = null;
    }

    @Test
    public void setFaceValue() throws Exception {
        terning.setFaceValue(5);
        assertEquals(terning.getFaceValue(), 5);
    }

    @Test
    public void getFaceValue() throws Exception {
        terning.setFaceValue(5);
        assertEquals(terning.getFaceValue(), 5);
    }

    @Test
    public void setLastValue() throws Exception {
        terning.setLastValue(5);
        assertEquals(terning.getLastValue(), 5);
    }

    @Test
    public void getLastValue() throws Exception {
        int roll = terning.roll();
        terning.roll();
        assertEquals(terning.getLastValue(), roll);
    }

    @Test
    public void roll() throws Exception {
        int testRollCount = 10000;
        int expected = testRollCount/MAX;
        float chiSquare = 0;
        int[] actual = new int[6];
        for(int i = 0; i<testRollCount; i++){
            terning.roll();
            switch(terning.getFaceValue()){
                case 1:
                    actual[0]++;
                    break;
                case 2:
                    actual[1]++;
                    break;
                case 3:
                    actual[2]++;
                    break;
                case 4:
                    actual[3]++;
                    break;
                case 5:
                    actual[4]++;
                    break;
                case 6:
                    actual[5]++;
                    break;
            }
        }
        for(int i = 0; i<actual.length; i++){
            chiSquare += Math.pow(actual[i]-expected, 2)/expected;
        }
        assertTrue(chiSquare< 11.07);
    }
}