package eu.viticlick.client.supplier.godwinds.response;

import eu.viticlick.client.ResponseAdapter;
import eu.viticlick.web.FlightSearchResponse;
import org.junit.Test;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by viticlick on 22/1/17.
 */
public class GodWindsResponseAdapterTest {

    private ResponseAdapter adapter = new GodWindsResponseAdapter();
    private static final String AIRLINE = "GodWinds";
    private static final String SUPPLIER = "GodWinds";
    private static final String IATA_ORIGIN = "AMS";
    private static final String IATA_DESTINATION = "LHR";
    private static final String ORIGIN_DEPARTURE_DATE = "02-20-2017 10:23:00";
    private static final String ORIGIN_ARRIVAL_DATE = "02-25-2017 22:43:00";
    private static final String TARGET_DEPARTURE_DATE = "2017-02-20";
    private static final String TARGET_ARRIVAL_DATE = "2017-02-25";
    private static final Character CABINCLASS = 'E';
    private static final Double PRICE = 102.12d;
    private static final String FARE = "102.12";


    @Test
    public void convertGodWindsResponse() throws Exception {
       GodWindsResponse godWindsResponse = new GodWindsResponse();
       godWindsResponse.setAirline(AIRLINE);
       godWindsResponse.setPrice(PRICE);
       godWindsResponse.setCabinclass(CABINCLASS);
       godWindsResponse.setDepartureAirportCode(IATA_ORIGIN);
       godWindsResponse.setDestinationAirportCode(IATA_DESTINATION);
       godWindsResponse.setDepartureDate(ORIGIN_DEPARTURE_DATE);
       godWindsResponse.setArrivalDate(ORIGIN_ARRIVAL_DATE);
       FlightSearchResponse response = adapter.convert(godWindsResponse);
       assertThat(response, hasProperty("airline", is(AIRLINE)));
       assertThat(response, hasProperty("supplier", is(SUPPLIER)));
       assertThat(response, hasProperty("fare", is(FARE)));
       assertThat(response, hasProperty("departureAirportCode", is(IATA_ORIGIN)));
       assertThat(response, hasProperty("destinationAirportCode", is(IATA_DESTINATION)));
       assertThat(response, hasProperty("departureDate", is(TARGET_DEPARTURE_DATE)));
       assertThat(response, hasProperty("arrivalDate", is(TARGET_ARRIVAL_DATE)));
    }

}