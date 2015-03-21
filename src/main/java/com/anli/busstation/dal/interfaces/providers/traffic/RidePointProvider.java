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

    List<RidePoint> findByArrivalTimeRange(DateTime arrivalTimeLeft, boolean leftStrict,
            DateTime arrivalTimeRight, boolean rightStrict);

    List<RidePoint> findByDepartureTimeRange(DateTime departureTimeLeft, boolean leftStrict,
            DateTime departureTimeRight, boolean rightStrict);

    List<BigInteger> collectIdsByRoutePoint(RoutePoint routePoint);

    List<BigInteger> collectIdsByAnyRoutePoint(Collection<RoutePoint> routePoints);

    List<BigInteger> collectIdsByArrivalTimeRange(DateTime arrivalTimeLeft, boolean leftStrict,
            DateTime arrivalTimeRight, boolean rightStrict);

    List<BigInteger> collectIdsByDepartureTimeRange(DateTime departureTimeLeft, boolean leftStrict,
            DateTime departureTimeRight, boolean rightStrict);
}
