package eu.viticlick.client.supplier.evilflights.response;

import eu.viticlick.client.ResponseAdapter;
import eu.viticlick.web.FlightSearchResponse;

import java.time.LocalDateTime;

/**
 * Created by viticlick on 22/1/17.
 */
public class EvilFlightsResponseAdapter implements ResponseAdapter<EvilFlightsResponse> {

    @Override
    public FlightSearchResponse convert(EvilFlightsResponse response) {
        FlightSearchResponse targetResponse = new FlightSearchResponse();
        targetResponse.setAirline(response.getCarrier());
        targetResponse.setSupplier(response.getSupplier());
        Double fare = calculateFair(response);
        targetResponse.setFare(String.format("%.2f",fare));
        targetResponse.setDepartureAirportCode(response.getDepartuerAirportName());
        targetResponse.setDestinationAirportCode(response.getArrivalAirportName());
        LocalDateTime departureDate = convertToDate(response.getDepartureDay(), response.getDepartureMonth(), response.getDepartureYear());
        targetResponse.setDepartureDate(departureDate);
        LocalDateTime arrivalDate = convertToDate(response.getReturnDay(), response.getReturnMonth(), response.getReturnYear());
        targetResponse.setArrivalDate(arrivalDate);
        return targetResponse;
    }

    private Double calculateFair(EvilFlightsResponse response){
       double fare = response.getBasePrice() * (100 - response.getDiscount())/ 100 ;
       return fare + response.getTax();
    }

    private LocalDateTime convertToDate(Integer day, Integer month, Integer year){
        LocalDateTime localDateTime = LocalDateTime.of(year,month,day,12,0);
        return localDateTime;
    }
}
