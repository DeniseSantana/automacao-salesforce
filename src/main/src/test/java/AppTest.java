package $br.com.automacao;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit br.com.salesforce.page.test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the br.com.salesforce.page.test case
     *
     * @param testName name of the br.com.salesforce.page.test case
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
    public void testApp()
    {
        assertTrue( true );
    }
}
