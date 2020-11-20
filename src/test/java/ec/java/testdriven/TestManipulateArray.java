package ec.java.testdriven;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TestManipulateArray {

    private ManipulateArray manipulateArray;

    @Before
    public void setUp() {
        int[] numArr = {1, 2, 3, 2};
        manipulateArray = new ManipulateArray(numArr);
    }

    @Test
    public void testGetAverage() {
        double expectedResult = 2.0;
        double actualResult = manipulateArray.getAverage();
        assertTrue(expectedResult == actualResult);
    }

    @Test
    public void testGetAverageWithWrongAnswer() {
        double expectedResult = 2.5;
        double actualResult = manipulateArray.getAverage();
        assertFalse(expectedResult == actualResult);
    }

    @Test
    public void testFindPositions() {
        int[] expectedResult = {1, 3};
        int[] actualResult = manipulateArray.findPositions(2);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindPositionsWithWrongPositions() {
        int[] expectedResult = {1, 3};
        int[] actualResult = manipulateArray.findPositions(3);
        assertTrue(!Arrays.equals(expectedResult, actualResult));
    }

    @Test
    public void testFindPositionsWithNonExistentElement() {
        int[] expectedResult = {};
        int[] actualResult = manipulateArray.findPositions(4);
        assertTrue(Arrays.equals(expectedResult, actualResult));
    }

    @Test
    public void testAppendLast() {
        int[] expectedResult = {1, 2, 3, 2, 4};
        manipulateArray.appendLast(4);
        int[] actualResult = manipulateArray.getNumArr();
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAppendLastWithWrongExpectedOutput() {
        int[] expectedResult = {1, 2, 3, 4, 2};
        manipulateArray.appendLast(4);
        int[] actualResult = manipulateArray.getNumArr();
        assertFalse(Arrays.equals(expectedResult, actualResult));
    }

    @Test
    public void testInsertAt() {
        int[] expectedResult = {1, 2, 5, 2};
        manipulateArray.insertAt(2,5);
        int[] actualResult = manipulateArray.getNumArr();
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testInsertAtWithWrongPosition() {
        int[] expectedResult = {1, 2, 3, 2};
        manipulateArray.insertAt(-1,5);
        int[] actualResult = manipulateArray.getNumArr();
        assertTrue(Arrays.equals(expectedResult, actualResult));
    }

    @Test
    public void testGetAt() {
        int expectedResult = 3;
        int actualResult = manipulateArray.getAt(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetAtWithWrongPosition() {
        int expectedResult = 0;
        int actualResult = manipulateArray.getAt(5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSetAt() {
        int[] expectedResult = {1, 2, 3, 2, 0, 4};
        manipulateArray.setAt(5,4);
        int[] actualResult = manipulateArray.getNumArr();
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSetAtWithDoubleValue() {
        int[] expectedResult = {1, 2, 3, 2, 0, 0, 0, 0, 4};
        manipulateArray.setAt((int) 8.88,4);
        int[] actualResult = manipulateArray.getNumArr();
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSetAtWithNonExistentPosition() {
        int[] expectedResult = {1, 2, 3, 2};
        manipulateArray.setAt((int) -8.88,4);
        int[] actualResult = manipulateArray.getNumArr();
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteAt() {
        int expectedResult = 2;
        int actualResult = manipulateArray.deleteAt(3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteAtWithNonExistentPosition() {
        int expectedResult = 0;
        int actualResult = manipulateArray.deleteAt((int) -3.33);
        assertEquals(expectedResult, actualResult);
    }
}
