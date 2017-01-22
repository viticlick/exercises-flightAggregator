package eu.viticlick.client.supplier.godwinds.response;

import eu.viticlick.client.ResponseAdapter;
import eu.viticlick.web.FlightSearchResponse;

/**
 * Created by viticlick on 22/1/17.
 */
public class GodWindsResponseAdapter implements ResponseAdapter<GodWindsResponse> {

    @Override
    public FlightSearchResponse convert(GodWindsResponse response) {
        FlightSearchResponse targetResponse = new FlightSearchResponse();
        targetResponse.setAirline(response.getAirline());
        targetResponse.setSupplier(response.getSupplier());
        targetResponse.setFare(response.getPrice().toString());
        targetResponse.setDepartureAirportCode(response.getDepartureAirportCode());
        targetResponse.setDestinationAirportCode(response.getDestinationAirportCode());
        targetResponse.setDepartureDate(response.getDepartureDate());
        targetResponse.setArrivalDate(response.getArrivalDate());
        return targetResponse;
    }

}
