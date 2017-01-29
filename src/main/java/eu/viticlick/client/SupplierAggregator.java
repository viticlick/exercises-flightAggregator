package eu.viticlick.client;

import eu.viticlick.web.FlightSearchRequest;
import eu.viticlick.web.FlightSearchResponse;

import java.util.List;

/**
 * Created by viticlick on 23/1/17.
 */
public interface SupplierAggregator {

    List<FlightSearchResponse> requestToSuppliers(FlightSearchRequest request);
}
