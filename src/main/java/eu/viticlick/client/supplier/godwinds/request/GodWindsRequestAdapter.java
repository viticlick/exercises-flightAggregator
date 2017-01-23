package eu.viticlick.client.supplier.godwinds.request;

import eu.viticlick.client.RequestAdapter;
import eu.viticlick.web.FlightSearchRequest;

/**
 * Created by viticlick on 23/1/17.
 */
public class GodWindsRequestAdapter implements RequestAdapter<GodWindsRequest> {
    @Override
    public GodWindsRequest convert(FlightSearchRequest request) {
        GodWindsRequest godWindsRequest = new GodWindsRequest();
        godWindsRequest.setDestination(request.getDestination());
        godWindsRequest.setOrigin(request.getOrigin());
        godWindsRequest.setNumberOfPassengers(request.getNumberOfPassengers());
        godWindsRequest.setDepartureDate(request.getDepartureDate());
        godWindsRequest.setReturnDate(request.getReturnDate());
        return godWindsRequest;
    }
}
