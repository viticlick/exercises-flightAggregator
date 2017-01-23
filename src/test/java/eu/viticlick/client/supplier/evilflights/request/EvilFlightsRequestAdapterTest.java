package eu.viticlick.client.supplier.evilflights.request;

import eu.viticlick.client.supplier.godwinds.request.GodWindsRequest;
import eu.viticlick.client.supplier.godwinds.request.GodWindsRequestAdapter;
import eu.viticlick.web.FlightSearchRequest;
import org.junit.Test;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by viticlick on 23/1/17.
 */
public class EvilFlightsRequestAdapterTest {

    private static final String DESTINATION = "RMA";
    private static final String ORIGIN = "SCQ";
    private static final Integer NUMBER_OF_PASSENGER = 4;
    private static final String DEPARTURE_DATE = "2017-01-20";
    private static final String ARRIVAL_DATE = "2017-01-25";
    private static final Integer DEPARTURE_DAY = 20;
    private static final Integer DEPARTURE_MONTH = 1;
    private static final Integer DEPARTURE_YEAR = 2017;
    private static final Integer ARRIVAL_DAY = 25;
    private static final Integer ARRIVAL_MONTH = 1;
    private static final Integer ARRIVAL_YEAR = 2017;


    @Test
    public void convert() throws Exception {
        FlightSearchRequest initialRequest = new FlightSearchRequest();
        initialRequest.setDestination(DESTINATION);
        initialRequest.setOrigin(ORIGIN);
        initialRequest.setDepartureDate(DEPARTURE_DATE);
        initialRequest.setReturnDate(ARRIVAL_DATE);
        initialRequest.setNumberOfPassengers(NUMBER_OF_PASSENGER);
        EvilFlightsRequestAdapter adapter = new EvilFlightsRequestAdapter();
        EvilFlightsRequest request = adapter.convert(initialRequest);
        assertThat(request, hasProperty( "to", is(DESTINATION)));
        assertThat(request, hasProperty( "from", is(ORIGIN)));
        assertThat(request, hasProperty( "numberOfAdults", is(NUMBER_OF_PASSENGER)));
        assertThat(request, hasProperty( "departureDay", is(DEPARTURE_DAY)));
        assertThat(request, hasProperty( "departureMonth", is(DEPARTURE_MONTH)));
        assertThat(request, hasProperty( "departureYear", is(DEPARTURE_YEAR)));
        assertThat(request, hasProperty( "returnDay", is(ARRIVAL_DAY)));
        assertThat(request, hasProperty( "returnMonth", is(ARRIVAL_MONTH)));
        assertThat(request, hasProperty( "returnYear", is(ARRIVAL_YEAR)));
    }

}
