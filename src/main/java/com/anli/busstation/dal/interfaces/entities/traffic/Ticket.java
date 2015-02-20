package com.anli.busstation.dal.interfaces.entities.traffic;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import com.anli.busstation.dal.interfaces.entities.staff.Salesman;
import java.math.BigDecimal;
import org.joda.time.DateTime;

public interface Ticket extends BSEntity {

    RidePoint getDeparturePoint();

    void setDeparturePoint(RidePoint departurePoint);

    RidePoint getArrivalPoint();

    void setArrivalPoint(RidePoint arrivalPoint);

    Integer getSeat();

    void setSeat(Integer seat);

    Salesman getSalesman();

    void setSalesman(Salesman salesman);

    DateTime getSaleDate();

    void setSaleDate(DateTime saleDate);

    String getCustomerName();

    void setCustomerName(String customerName);

    BigDecimal getPrice();

    void setPrice(BigDecimal price);

    boolean isSold();

    void setSold(boolean sold);
}
