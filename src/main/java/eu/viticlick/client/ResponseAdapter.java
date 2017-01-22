package eu.viticlick.client;

import eu.viticlick.web.FlightSearchResponse;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by viticlick on 22/1/17.
 */
@FunctionalInterface
public interface ResponseAdapter<T>{

    FlightSearchResponse convert(T response);

    default List<FlightSearchResponse> convert(List<T> responses){
        return responses.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}
