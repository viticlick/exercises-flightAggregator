package eu.viticlick.client;

import eu.viticlick.client.supplier.evilflights.EvilFlightsRunner;
import eu.viticlick.client.supplier.godwinds.GodWindsRunner;
import eu.viticlick.web.FlightSearchRequest;
import eu.viticlick.web.FlightSearchResponse;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * Created by viticlick on 23/1/17.
 */
@Service
public class SupplierAggregatorImpl implements SupplierAggregator {



    @Override
    public List<FlightSearchResponse> requestToSuppliers(FlightSearchRequest request) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        BlockingQueue<FlightSearchResponse> responseQueue = new LinkedBlockingQueue<>();
        SupplierRunner godWindsRunner = new GodWindsRunner(request,responseQueue);
        SupplierRunner evilFlightsRunner = new EvilFlightsRunner(request,responseQueue);
        service.execute(godWindsRunner);
        service.execute(evilFlightsRunner);
        service.shutdown();
        return sortByFare(responseQueue);
    }

    private List<FlightSearchResponse> sortByFare(Collection<FlightSearchResponse> responsetList){
        return responsetList.stream()
                .sorted(Comparator.comparing(FlightSearchResponse::getFare))
                .collect(Collectors.toList());
    }
}
