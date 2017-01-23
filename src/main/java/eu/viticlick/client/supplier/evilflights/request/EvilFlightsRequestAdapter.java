package eu.viticlick.client.supplier.evilflights.request;

import eu.viticlick.client.RequestAdapter;
import eu.viticlick.client.supplier.evilflights.response.EvilFlightsResponse;
import eu.viticlick.web.FlightSearchRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by viticlick on 23/1/17.
 */
public class EvilFlightsRequestAdapter implements RequestAdapter<EvilFlightsRequest>{

    @Override
    public EvilFlightsRequest convert(FlightSearchRequest request) {
        EvilFlightsRequest evilFlightsRequest = new EvilFlightsRequest();
        evilFlightsRequest.setFrom(request.getOrigin());
        evilFlightsRequest.setTo(request.getDestination());
        LocalDate departureDate = request.getDepartureDate();
        evilFlightsRequest.setDepartureDay(departureDate.getDayOfMonth());
        evilFlightsRequest.setDepartureMonth(departureDate.getMonthValue());
        evilFlightsRequest.setDepartureYear(departureDate.getYear());
        LocalDate returnDate = request.getReturnDate();
        evilFlightsRequest.setReturnDay(returnDate.getDayOfMonth());
        evilFlightsRequest.setReturnMonth(returnDate.getMonthValue());
        evilFlightsRequest.setReturnYear(returnDate.getYear());
        evilFlightsRequest.setNumberOfAdults(request.getNumberOfPassengers());
        return evilFlightsRequest;
    }
}
