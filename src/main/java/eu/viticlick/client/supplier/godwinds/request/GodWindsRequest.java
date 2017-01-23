package eu.viticlick.client.supplier.godwinds.request;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by viticlick on 23/1/17.
 */
public class GodWindsRequest {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    private String origin;
    private String destination;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private Integer numberOfPassengers;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDate() {
        return departureDate.format(DATE_TIME_FORMATTER);
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate.format(DATE_TIME_FORMATTER);
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
