# Flights Exercise

## Background
MyFlights is a flight search which aggregates flight results from two differents suppliers (GodWinds and EvilFlights)

## Requeriments
The service is built on springboot
The service should produce an aggregated result form both suppliers
The service should produce a JSON response which contains a list of flights ordered by fare which has the following attribures

| Key      | Value |
|----------|----------------------------|
| airline  | Name of airline            |
| supplier | Eg. GodWinds or EvilFlights|
| fare | Total price rounded to 2 decimals |
| departureAirportCode | 3 letter IATA code(eg LHR,AMS)|
| destinationAriportCode | 3 letter IATA code(eg LHR,AMS)|
|departureDate|Date Time in ISO8601 |
|arrivalDate | Date Time in ISO8601 |

The service should expose the following search attriburtes

| Key | Value |
|-----|------|
|origin| 3 letter IATA code (eg. LHR, AMS)|
|destination|3 letter IATA code (eg. LHR, AMS)|
|departureDate | Date in ISO8601 |
|returnDate | Date in ISO8601 |
|numberOfPassengers | Maximum 4 passengers |

The service should connect to the both suppliers using HTTP.

# GodWinds 
## Request
| Key | Value |
|-----|------|
|origin| 3 letter IATA code (eg. LHR, AMS)|
|destination|3 letter IATA code (eg. LHR, AMS)|
|departureDate | mm-dd-yyyy |
|returnDate | mm-dd-yyyy |
|numberOfPassengers | Number of passengers |

## Response
The response provided by GodWinds contains a list of flights with the following attributes:
|Key|Value|
|---|-----|
|airline | Name of the airline |
| price | Total price |
| cabinclass | E fro Economy and B for Business |
|departureAirportCode | Eg: LHR |
|destinationAirportCode | Eg: LHR |
|departureDate | mm-dd-yyyy HH:MM:ss |
|arrivalDate | mm-dd-yyyy HH:MM:ss |

# EvilFlights
## Request
| Key | Value |
|-----|------|
|from| 3 letter IATA code (eg. LHR, AMS)|
|to|3 letter IATA code (eg. LHR, AMS)|
|departureMonth | Mont as Integer(1-12) |
|departureYear | 4 digit Year |
|returnDay | Day of the Month |
|returnMonth | Month as Integer(1-12)|
|returnYear | 4 digits Year |
|numberOfAdults | Number of passengers |

## Response 
|Key|Value|
|---|----|
|carrier|Name of the Airline|
|basePrice| Price without tax( doesn't include discount)|
|tax | Tax which needs to be charged along with|
|discount | Discount which needs to be applied on the price ( in percentage ) |
|departureAirportName | 3 letter IATA code (eg. LHR, AMS)|
|arrivalAirportName | 3 letter IATA code (eg. LHR, AMS)|
|departureDay| Day of the Month |
|departureMonth | Month as Integer(1-12)|
|departureYear | 4 digit Year |
|returnDay | Day of the Month |
|returnMonth | Month as Integer(1-12)|
|returnYear | 4 digit Year |


