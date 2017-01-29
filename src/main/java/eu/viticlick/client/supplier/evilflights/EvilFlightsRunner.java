package eu.viticlick.client.supplier.evilflights;

import eu.viticlick.client.SupplierRunner;
import eu.viticlick.client.supplier.evilflights.request.EvilFlightsRequest;
import eu.viticlick.client.supplier.evilflights.request.EvilFlightsRequestAdapter;
import eu.viticlick.client.supplier.evilflights.response.EvilFlightsResponse;
import eu.viticlick.client.supplier.evilflights.response.EvilFlightsResponseAdapter;
import eu.viticlick.web.FlightSearchRequest;
import eu.viticlick.web.FlightSearchResponse;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * Created by viticlick on 23/1/17.
 */
public class EvilFlightsRunner implements SupplierRunner{

    private static final String URL = "http://evilFligths.com/service";
    private final Collection<FlightSearchResponse> responseCollection;
    private final FlightSearchRequest request;
    private static final EvilFlightsRequestAdapter evilFlightsRequestAdapter = new EvilFlightsRequestAdapter();
    private static final EvilFlightsResponseAdapter evilFlightsResponseAdapter = new EvilFlightsResponseAdapter();

    public EvilFlightsRunner(FlightSearchRequest request, BlockingQueue<FlightSearchResponse> responseCollection) {
        this.request = request;
        this.responseCollection = responseCollection;
    }

    @Override
    public void run() {
        EvilFlightsRequest evilFlightsRequest = evilFlightsRequestAdapter.convert(this.request);
        RestTemplate template = new RestTemplate();
        EvilFlightsResponse[] response = template.postForObject(URL, evilFlightsRequest, EvilFlightsResponse[].class);
        List<FlightSearchResponse> responses = evilFlightsResponseAdapter.convert(Arrays.asList(response));
        responseCollection.addAll(responses);
    }
}
