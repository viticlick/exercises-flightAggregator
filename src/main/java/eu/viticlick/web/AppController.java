package eu.viticlick.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Controller
public class AppController {


    @RequestMapping(path = "/api" , method = RequestMethod.POST )
    public @ResponseBody List<FlightSearchResponse> doRequest( @RequestBody FlightSearchRequest request){
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<FlightSearchRequest>> constraintViolationSet = validator.validate(request);
        List<FlightSearchResponse> response =  new LinkedList<>();
        return response;
    }
}
