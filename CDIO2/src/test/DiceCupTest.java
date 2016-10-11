package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import spil.*;

public class DiceCupTest {
    DiceCup cup;
    @Before
    public void setUp() throws Exception {
        cup = new DiceCup();
    }

    @After
    public void tearDown() throws Exception {
        cup = null;
    }

    @Test
    public void getRoundScore() throws Exception {
        int score = cup.throwDice();
        assertEquals(cup.getRoundScore(), score);
    }

    @Test
    public void setRoundScore() throws Exception {
        cup.setRoundScore(10);
        assertEquals(cup.getRoundScore(), 10);
    }

    @Test
    public void getD1() throws Exception {
        int score = cup.throwDice();
        assertEquals(score-cup.getD2(), cup.getD1());
    }

    @Test
    public void getD2() throws Exception {
        int score = cup.throwDice();
        assertEquals(score-cup.getD1(), cup.getD2());
    }

    @Test
    public void getLastD1() throws Exception {
        int score = cup.throwDice();
        cup.throwDice();
        assertEquals(score-cup.getLastD1(), cup.getLastD2());
    }

    @Test
    public void getLastD2() throws Exception {
        int score = cup.throwDice();
        cup.throwDice();
        assertEquals(score-cup.getLastD2(), cup.getLastD1());
    }

    @Test
    public void throwDice() throws Exception {
        int score = cup.throwDice();
        assertEquals(score, cup.getD1()+cup.getD2());
    }

}