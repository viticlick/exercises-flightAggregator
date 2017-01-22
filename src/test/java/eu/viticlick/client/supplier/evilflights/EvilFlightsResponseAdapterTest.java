package eu.viticlick.client.supplier.evilflights;

import eu.viticlick.client.ResponseAdapter;
import eu.viticlick.client.supplier.evilflights.response.EvilFlightsResponse;
import eu.viticlick.client.supplier.evilflights.response.EvilFlightsResponseAdapter;
import eu.viticlick.web.FlightSearchResponse;
import org.junit.Test;


import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by viticlick on 22/1/17.
 */
public class EvilFlightsResponseAdapterTest {
    private ResponseAdapter adapter = new EvilFlightsResponseAdapter();
    private static final String AIRLINE = "RyanBest";
    private static final String SUPPLIER = "EvilFlights";
    private static final Double BASE_PRICE = 100d;
    private static final Double TAX = 10d;
    private static final Integer DISCOUNT = 10;
    private static final String IATA_ORIGIN = "AMS";
    private static final String IATA_DESTINATION = "LHR";
    private static final Integer DEPARTURE_DAY = 20;
    private static final Integer DEPARTURE_MONTH = 2;
    private static final Integer DEPARTURE_YEAR = 2017;
    private static final Integer ARRIVAL_DAY = 23;
    private static final Integer ARRIVAL_MONTH = 2;
    private static final Integer ARRIVAL_YEAR = 2017;
    private static final String DEPARTURE_DATE = "2017-02-20";
    private static final String ARRIVAL_DATE = "2017-02-23";
    private static final String FARE = "100,00";


    @Test
    public void convertGodWindsResponse() throws Exception {
        EvilFlightsResponse evilFlightsResponse = new EvilFlightsResponse();
        evilFlightsResponse.setCarrier(AIRLINE);
        evilFlightsResponse.setBasePrice(BASE_PRICE);
        evilFlightsResponse.setTax(TAX);
        evilFlightsResponse.setDiscount(DISCOUNT);
        evilFlightsResponse.setDepartuerAirportName(IATA_ORIGIN);
        evilFlightsResponse.setArrivalAirportName(IATA_DESTINATION);
        evilFlightsResponse.setDepartureDay(DEPARTURE_DAY);
        evilFlightsResponse.setDepartureMonth(DEPARTURE_MONTH);
        evilFlightsResponse.setDepartureYear(DEPARTURE_YEAR);
        evilFlightsResponse.setReturnDay(ARRIVAL_DAY);
        evilFlightsResponse.setReturnMonth(ARRIVAL_MONTH);
        evilFlightsResponse.setReturnYear(ARRIVAL_YEAR);

        FlightSearchResponse response = adapter.convert(evilFlightsResponse);
        assertThat(response, hasProperty("airline", is(AIRLINE)));
        assertThat(response, hasProperty("supplier", is(SUPPLIER)));
        assertThat(response, hasProperty("fare", is(FARE)));
        assertThat(response, hasProperty("departureAirportCode", is(IATA_ORIGIN)));
        assertThat(response, hasProperty("destinationAirportCode", is(IATA_DESTINATION)));
        assertThat(response, hasProperty("departureDate", is(DEPARTURE_DATE)));
        assertThat(response, hasProperty("arrivalDate", is(ARRIVAL_DATE)));
    }
}
