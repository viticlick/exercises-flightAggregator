package eu.viticlick.web;


import org.apache.tomcat.jni.Local;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by viticlick on 13/1/17.
 */
public class FlightSearchRequest {


    @Size(min=3, max = 3)
    private String origin;

    @Size(min=3, max = 3)
    private String destination;
    private LocalDate departureDate;
    private LocalDate returnDate;

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

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = LocalDate.parse(departureDate,DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = LocalDate.parse(returnDate,DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
