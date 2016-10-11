package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import spil.*;

public class PlayerTest {
    Player player;
    @Before
    public void setUp() throws Exception {
        player = new Player();
    }

    @After
    public void tearDown() throws Exception {
        player = null;
    }

    @Test
    public void getPoints() throws Exception {
        player.setPoints(5);
        assertEquals(player.getPoints(), 5);
    }

    @Test
    public void setPoints() throws Exception {
        player.setPoints(5);
        assertEquals(player.getPoints(), 5);
    }

    @Test
    public void addPoints() throws Exception {
        player.setPoints(5);
        player.addPoints(5);
        assertEquals(player.getPoints(), 10);
    }

    @Test
    public void getName() throws Exception {
        player.setName("Test");
        assertEquals(player.getName(), "Test");
    }

}