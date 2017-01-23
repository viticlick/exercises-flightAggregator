package eu.viticlick.client.supplier;

import eu.viticlick.client.supplier.evilflights.EvilFlightsTestSuite;
import eu.viticlick.client.supplier.godwinds.GodWindsTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by viticlick on 23/1/17.
 */
@RunWith(Suite.class)
@SuiteClasses({
        EvilFlightsTestSuite.class,
        GodWindsTestSuite.class
})
public class SuppliersTestsCase {
}
