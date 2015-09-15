package cz.educanet;

import static org.junit.Assert.*;

/**
 * Created by semanticer on 15. 9. 2015.
 */
public class MainTest {

    //TODO write more tests for everything

    @org.junit.Test
    public void testGerland() throws Exception {
        // setup
        String zero = "programmer";
        String one = "ceramic";
        String two = "onion";
        String four = "alfalfa";

        // exercise
        int zeroResult = Main.gerland(zero);
        int oneResult = Main.gerland(one);
        int twoResult = Main.gerland(two);
        int fourResult = Main.gerland(four);

        // verify
        assertEquals(0, zeroResult);
        assertEquals(1, oneResult);
        assertEquals(2, twoResult);
        assertEquals(4, fourResult);
    }

    @org.junit.Test
    public void testDisemvoweler() throws Exception {
        // setup
        String first = "all those who believe in psychokinesis raise my hand";
        String second = "did you hear about the excellent farmer who was outstanding in his field";

        // exercise
        DissVow firstResult = Main.disemvoweler(first);
        DissVow secondResult = Main.disemvoweler(second);

        // verify
        assertEquals("llthswhblvnpsychknssrsmyhnd", firstResult.diss);
        assertEquals("aoeoeieeioieiaiea", firstResult.vow);

        assertEquals("ddyhrbtthxcllntfrmrwhwststndngnhsfld", secondResult.diss);
        assertEquals("ioueaaoueeeeaeoaouaiiiie", secondResult.vow);
    }

    @org.junit.Test
    public void testBalance() throws Exception {
        // setup
        String firstTrue = "(if (zero? x) max (/ 1 x))";
        String secondTrue = "I told him (that it’s not (yet) done). (But he wasn’t listening)";
        String firstFalse = ":-)";
        String secondFalse = "())(";

        // exercise & verify
        assertTrue(Main.balance(firstTrue));
        assertTrue(Main.balance(secondTrue));
        assertFalse(Main.balance(firstFalse));
        assertFalse(Main.balance(secondFalse));

    }
}