package eu.viticlick.client.supplier.godwinds.response;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.DoubleSummaryStatistics;

/**
 * Created by viticlick on 22/1/17.
 */
public class GodWindsResponse {

    private final static String supplier = "GodWinds";
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    private String airline;
    private Double price;
    private Character cabinclass;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Character getCabinclass() {
        return cabinclass;
    }

    public void setCabinclass(Character cabinclass) {
        this.cabinclass = cabinclass;
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

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = LocalDateTime.parse( departureDate, FORMATTER);
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = LocalDateTime.parse(arrivalDate, FORMATTER);
    }

    public static String getSupplier() {
        return supplier;
    }
}
