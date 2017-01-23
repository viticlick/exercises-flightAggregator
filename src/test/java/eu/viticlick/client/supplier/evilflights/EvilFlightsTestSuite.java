package eu.viticlick.client.supplier.evilflights;

import eu.viticlick.client.supplier.evilflights.request.EvilFlightsRequestAdapterTest;
import eu.viticlick.client.supplier.evilflights.response.EvilFlightsResponseAdapterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by viticlick on 23/1/17.
 */
@RunWith(Suite.class)
@SuiteClasses({
        EvilFlightsRequestAdapterTest.class,
        EvilFlightsResponseAdapterTest.class
})
public class EvilFlightsTestSuite {
}
