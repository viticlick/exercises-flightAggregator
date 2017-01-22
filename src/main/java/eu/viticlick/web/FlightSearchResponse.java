package eu.viticlick.web;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by viticlick on 13/1/17.
 */
public class FlightSearchResponse {

    private String airline;
    private String supplier;
    private String fare;
    private String departureAirportCode;
    private String destinationAirportCode;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public String getDepartureDate() {
        return departureDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
