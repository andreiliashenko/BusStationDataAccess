package com.anli.busstation.dal.interfaces.entities.traffic;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import java.math.BigDecimal;
import java.util.List;

public interface Route extends BSEntity {

    String getNumCode();

    void setNumCode(String numCode);

    BigDecimal getTicketPrice();

    void setTicketPrice(BigDecimal ticketPrice);

    List<RoutePoint> getRoutePoints();

    List<Ride> getRides();
}
