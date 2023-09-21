package IutBlagnac;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */

     /*
      * Test with parameter
      * @param String
      * @return String
      */
    public void testWithParameter()
    {
        assertEquals("J'aimerais avoir 20", App.hello("J'aimerais avoir 20"));
    }

    /*
     * Test without parameter
     * @return Hello World!
     */
    public void testWithoutParameter(){
        assertEquals("Hello World!", App.hello());
    }
}   
