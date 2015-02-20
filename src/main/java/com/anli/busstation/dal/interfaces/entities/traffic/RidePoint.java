package com.anli.busstation.dal.interfaces.entities.traffic;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import org.joda.time.DateTime;

public interface RidePoint extends BSEntity {

    RoutePoint getRoutePoint();

    void setRoutePoint(RoutePoint routePoint);

    DateTime getArrivalTime();

    void setArrivalTime(DateTime arrivalTime);

    DateTime getDepartureTime();

    void setDepartureTime(DateTime departureTime);
}
