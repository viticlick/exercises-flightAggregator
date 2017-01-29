package eu.viticlick.client.supplier.godwinds;

import eu.viticlick.client.SupplierRunner;
import eu.viticlick.client.supplier.godwinds.request.GodWindsRequest;
import eu.viticlick.client.supplier.godwinds.request.GodWindsRequestAdapter;
import eu.viticlick.client.supplier.godwinds.response.GodWindsResponse;
import eu.viticlick.client.supplier.godwinds.response.GodWindsResponseAdapter;
import eu.viticlick.web.FlightSearchRequest;
import eu.viticlick.web.FlightSearchResponse;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * Created by viticlick on 23/1/17.
 */
public class GodWindsRunner implements SupplierRunner{

    private static final String URL = "http://godwinds.com/service";
    private final Collection<FlightSearchResponse> responseCollection;
    private final GodWindsRequest request;
    private static final GodWindsRequestAdapter requestAdapter = new GodWindsRequestAdapter();
    private static final GodWindsResponseAdapter responseAdapter = new GodWindsResponseAdapter();

    public GodWindsRunner(FlightSearchRequest request,Collection<FlightSearchResponse> responseCollection) {
       this.responseCollection = responseCollection;
       this.request = requestAdapter.convert(request);
    }

    @Override
    public void run() {
        RestTemplate template = new RestTemplate();
        GodWindsResponse[] response = template.postForObject(URL, this.request, GodWindsResponse[].class);
        List<FlightSearchResponse> responses = responseAdapter.convert(Arrays.asList(response));
        this.responseCollection.addAll(responses);
    }
}
