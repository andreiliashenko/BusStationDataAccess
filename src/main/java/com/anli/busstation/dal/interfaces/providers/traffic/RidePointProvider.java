package com.anli.busstation.dal.interfaces.providers.traffic;

import com.anli.busstation.dal.interfaces.entities.traffic.RidePoint;
import com.anli.busstation.dal.interfaces.entities.traffic.RoutePoint;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import org.joda.time.DateTime;

public interface RidePointProvider extends BSEntityProvider<RidePoint> {

    List<RidePoint> findByRoutePoint(RoutePoint routePoint);

    List<RidePoint> findByAnyRoutePoint(Collection<RoutePoint> routePoints);

    List<RidePoint> findByArrivalTimeRange(DateTime arrivalTimeLeft, boolean strictLeft,
            DateTime arrivalTimeRight, boolean strictRight);

    List<RidePoint> findByDepartureTimeRange(DateTime departureTimeLeft, boolean strictLeft,
            DateTime departureTimeRight, boolean strictRight);

    List<BigInteger> collectIdsByRoutePoint(RoutePoint routePoint);

    List<BigInteger> collectIdsByAnyRoutePoint(Collection<RoutePoint> routePoints);

    List<BigInteger> collectIdsByArrivalTimeRange(DateTime arrivalTimeLeft, boolean strictLeft,
            DateTime arrivalTimeRight, boolean strictRight);

    List<BigInteger> collectIdsByDepartureTimeRange(DateTime departureTimeLeft, boolean strictLeft,
            DateTime departureTimeRight, boolean strictRight);
}
