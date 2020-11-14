package ec.java.testdriven;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestArrayInterface {

    private UnitTest unitTest;

    @Before
    public void setUp() {
        int[] numArr = {1, 2, 3, 2};
        unitTest = new UnitTest(numArr);
    }

    @Test
    public void testGetAverage() {
        double expectedResult = 2.0;
        double actualResult = unitTest.getAverage();
        assertTrue(expectedResult == actualResult);
    }

    @Test
    public void testFindPositions() {
        int[] expectedResult = {1, 3};
        int[] actualResult = unitTest.findPositions(2);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAppendLast() {
        int[] expectedResult = {1, 2, 3, 2, 4};
        unitTest.appendLast(4);
        int[] actualResult = unitTest.getNumArr();
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testInsertAt() {
        int[] expectedResult = {1, 2, 5, 2};
        unitTest.insertAt(2,5);
        int[] actualResult = unitTest.getNumArr();
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetAt() {
        int expectedResult = 3;
        int actualResult = unitTest.getAt(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSetAt() {
        int[] expectedResult = {1, 2, 3, 4};
        unitTest.setAt(3,4);
        int[] actualResult = unitTest.getNumArr();
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteAt() {
        int expectedResult = 2;
        int actualResult = unitTest.deleteAt(3);
        assertEquals(expectedResult, actualResult);
    }
}
