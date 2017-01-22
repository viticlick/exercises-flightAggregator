package eu.viticlick.client.supplier.evilflights.response;

/**
 * Created by viticlick on 22/1/17.
 */
public class EvilFlightsResponse {
    private static final String supplier = "EvilFlights";
    private String carrier;
    private Double basePrice;
    private Double tax;
    private Integer discount;
    private String departuerAirportName;
    private String arrivalAirportName;
    private Integer departureDay;
    private Integer departureMonth;
    private Integer departureYear;
    private Integer returnDay;
    private Integer returnMonth;
    private Integer returnYear;

    public static String getSupplier() {
        return supplier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public void setDepartuerAirportName(String departuerAirportName) {
        this.departuerAirportName = departuerAirportName;
    }

    public void setArrivalAirportName(String arrivalAirportName) {
        this.arrivalAirportName = arrivalAirportName;
    }

    public void setDepartureDay(Integer departureDay) {
        this.departureDay = departureDay;
    }

    public String getCarrier() {
        return carrier;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public Double getTax() {
        return tax;
    }

    public Integer getDiscount() {
        return discount;
    }

    public String getDepartuerAirportName() {
        return departuerAirportName;
    }

    public String getArrivalAirportName() {
        return arrivalAirportName;
    }

    public Integer getDepartureDay() {
        return departureDay;
    }

    public Integer getDepartureMonth() {
        return departureMonth;
    }

    public Integer getDepartureYear() {
        return departureYear;
    }

    public Integer getReturnDay() {
        return returnDay;
    }

    public Integer getReturnMonth() {
        return returnMonth;
    }

    public Integer getReturnYear() {
        return returnYear;
    }

    public void setDepartureMonth(Integer departureMonth) {
        this.departureMonth = departureMonth;
    }

    public void setDepartureYear(Integer departureYear) {
        this.departureYear = departureYear;
    }

    public void setReturnDay(Integer returnDay) {
        this.returnDay = returnDay;
    }

    public void setReturnMonth(Integer returnMonth) {
        this.returnMonth = returnMonth;
    }

    public void setReturnYear(Integer returnYear) {
        this.returnYear = returnYear;
    }
}
