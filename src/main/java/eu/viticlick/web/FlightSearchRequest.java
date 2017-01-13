package eu.viticlick.web;


import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

/**
 * Created by viticlick on 13/1/17.
 */
public class FlightSearchRequest {

    @Size(min=3, max = 3)
    private String origin;

    @Size(min=3, max = 3)
    private String destination;
    private String departureDate;
    private String returnDate;

    @Max(value = 4)
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
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
