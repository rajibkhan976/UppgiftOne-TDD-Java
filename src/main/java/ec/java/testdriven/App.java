package ec.java.testdriven;

/**
 * App: Unit testing
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] numArr = {1,2,3,2};
        UnitTest test = new UnitTest(numArr);
        test.getAverage();
        test.findPositions(2);
        test.appendLast(4);
        test.insertAt(3,4);
        test.getAt(2);
        test.setAt(2,5);
        test.deleteAt(1);
    }
}
