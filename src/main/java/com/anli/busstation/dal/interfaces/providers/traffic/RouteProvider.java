package com.anli.busstation.dal.interfaces.providers.traffic;

import com.anli.busstation.dal.interfaces.entities.traffic.Ride;
import com.anli.busstation.dal.interfaces.entities.traffic.Route;
import com.anli.busstation.dal.interfaces.entities.traffic.RoutePoint;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface RouteProvider extends BSEntityProvider<Route> {

    Route pullRoutePoints(Route route);

    Route pullRides(Route route);

    List<Route> findByNumCode(String numCode);

    List<Route> findByAnyNumCode(Collection<String> numCodes);

    List<Route> findByTicketPriceRange(BigDecimal ticketPriceLeft, boolean strictLeft,
            BigDecimal ticketPriceRight, boolean strictRight);

    List<Route> findByRoutePoint(RoutePoint routePoint);

    List<Route> findByAnyRoutePoint(Collection<RoutePoint> routePoints);

    List<Route> findByRide(Ride ride);

    List<Route> findByAnyRide(Collection<Ride> rides);

    List<BigInteger> collectIdsByNumCode(String numCode);

    List<BigInteger> collectIdsByAnyNumCode(Collection<String> numCodes);

    List<BigInteger> collectIdsByTicketPriceRange(BigDecimal ticketPriceLeft, boolean strictLeft,
            BigDecimal ticketPriceRight, boolean strictRight);

    List<BigInteger> collectIdsByRoutePoint(RoutePoint routePoint);

    List<BigInteger> collectIdsByAnyRoutePoint(Collection<RoutePoint> routePoints);

    List<BigInteger> collectIdsByRide(Ride ride);

    List<BigInteger> collectIdsByAnyRide(Collection<Ride> rides);
}
