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

    List<RidePoint> findByAnyRoutePoint(Collection<RoutePoint> routePointList);

    List<RidePoint> findByArrivalTimeRange(DateTime leftTime, boolean leftStrict,
            DateTime rightTime, boolean rightStrict);

    List<RidePoint> findByDepartureTimeRange(DateTime leftTime, boolean leftStrict,
            DateTime rightTime, boolean rightStrict);

    List<BigInteger> collectIdsByRoutePoint(RoutePoint routePoint);

    List<BigInteger> collectIdsByAnyRoutePoint(Collection<RoutePoint> routePointList);

    List<BigInteger> collectIdsByArrivalTimeRange(DateTime leftTime, boolean leftStrict,
            DateTime rightTime, boolean rightStrict);

    List<BigInteger> collectIdsByDepartureTimeRange(DateTime leftTime, boolean leftStrict,
            DateTime rightTime, boolean rightStrict);
}
