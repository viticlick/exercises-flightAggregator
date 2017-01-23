package eu.viticlick.client.supplier.godwinds;

import eu.viticlick.client.supplier.godwinds.request.GodWindsRequestAdapterTest;
import eu.viticlick.client.supplier.godwinds.response.GodWindsResponseAdapterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by viticlick on 23/1/17.
 */
@RunWith(Suite.class)
@SuiteClasses({
        GodWindsRequestAdapterTest.class,
        GodWindsResponseAdapterTest.class
})
public class GodWindsTestSuite {
}
