package eu.viticlick.client;

import eu.viticlick.web.FlightSearchRequest;
import jdk.nashorn.internal.objects.annotations.Function;

/**
 * Created by viticlick on 23/1/17.
 */
public interface RequestAdapter <T>{

   T convert(FlightSearchRequest request);

}
