package eu.viticlick.client.supplier.godwinds.request;

import eu.viticlick.web.FlightSearchRequest;
import org.junit.Test;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by viticlick on 23/1/17.
 */
public class GodWindsRequestAdapterTest {

    private static final String DESTINATION = "RMA";
    private static final String ORIGIN = "SCQ";
    private static final Integer NUMBER_OF_PASSENGER = 4;
    private static final String DEPARTURE_DATE = "2017-01-20";
    private static final String ARRIVAL_DATE = "2017-01-25";
    private static final String REQUEST_DEPARTURE_DATE = "01-20-2017";
    private static final String REQUEST_ARRIVAL_DATE = "01-25-2017";


    @Test
    public void convert() throws Exception {
        FlightSearchRequest initialRequest = new FlightSearchRequest();
        initialRequest.setDestination(DESTINATION);
        initialRequest.setOrigin(ORIGIN);
        initialRequest.setDepartureDate(DEPARTURE_DATE);
        initialRequest.setReturnDate(ARRIVAL_DATE);
        initialRequest.setNumberOfPassengers(NUMBER_OF_PASSENGER);
        GodWindsRequestAdapter adapter = new GodWindsRequestAdapter();
        GodWindsRequest request = adapter.convert(initialRequest);
        assertThat(request, hasProperty("origin", is(ORIGIN)));
        assertThat(request, hasProperty("destination", is(DESTINATION)));
        assertThat(request, hasProperty("departureDate", is(REQUEST_DEPARTURE_DATE)));
        assertThat(request, hasProperty("returnDate", is(REQUEST_ARRIVAL_DATE)));
        assertThat(request, hasProperty("numberOfPassengers", is(NUMBER_OF_PASSENGER)));

    }
}