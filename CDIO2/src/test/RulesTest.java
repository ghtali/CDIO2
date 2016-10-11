package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import spil.*;

public class RulesTest {
    DiceCup cup;
    Player player;
    @Before
    public void setUp() throws Exception {
        cup = new DiceCup();
        player = new Player();
    }

    @After
    public void tearDown() throws Exception {
        cup = null;
    }

    @Test
    public void evalEqual() throws Exception {
        cup.throwDice();
        if(cup.getD1() == cup.getD2()){
            assertTrue(Rules.evalEqual(cup));
        }else {
            assertFalse(Rules.evalEqual(cup));
        }
    }

    @Test
    public void evalTwoOnes() throws Exception {
        cup.throwDice();
        if(cup.getD1() == 1 && 1 == cup.getD2()){
            assertTrue(Rules.evalTwoOnes(cup));
        }else {
            assertFalse(Rules.evalTwoOnes(cup));
        }
    }

    @Test
    public void evalTwoSixesInRow() throws Exception {
        cup.throwDice();
        if(cup.getD1() == 6 && 6 == cup.getD2()){
            assertTrue(Rules.evalTwoSixesInRow(cup));
        }else {
            assertFalse(Rules.evalTwoSixesInRow(cup));
        }
    }

    @Test
    public void evalFourty() throws Exception {
        player.setPoints(40);
        assertTrue(Rules.evalFourty(player));
    }

}