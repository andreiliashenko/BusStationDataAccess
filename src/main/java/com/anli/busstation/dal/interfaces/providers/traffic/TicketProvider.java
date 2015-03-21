package com.anli.busstation.dal.interfaces.providers.traffic;

import com.anli.busstation.dal.interfaces.entities.traffic.RidePoint;
import com.anli.busstation.dal.interfaces.entities.staff.Salesman;
import com.anli.busstation.dal.interfaces.entities.traffic.Ticket;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import org.joda.time.DateTime;

public interface TicketProvider extends BSEntityProvider<Ticket> {

    List<Ticket> findByDeparturePoint(RidePoint departurePoint);

    List<Ticket> findByAnyDeparturePoint(Collection<RidePoint> departurePoints);

    List<Ticket> findByArrivalPoint(RidePoint arrivalPoint);

    List<Ticket> findByAnyArrivalPoint(Collection<RidePoint> arrivalPoints);

    List<Ticket> findBySeat(Integer seat);

    List<Ticket> findBySeatRange(Integer seatLeft, boolean strictLeft,
            Integer seatRight, boolean strictRight);

    List<Ticket> findBySalesman(Salesman salesman);

    List<Ticket> findByAnySalesman(Collection<Salesman> salesmen);

    List<Ticket> findBySaleDateRange(DateTime saleDateLeft, boolean strictLeft,
            DateTime saleDateRight, boolean strictRight);

    List<Ticket> findByCustomerName(String customerName);

    List<Ticket> findByCustomerNameRegexp(String customerNameRegexp);

    List<Ticket> findByPriceRange(BigDecimal priceLeft, boolean strictLeft,
            BigDecimal priceRight, boolean strictRight);

    List<Ticket> findBySold(boolean sold);

    List<BigInteger> collectIdsByDeparturePoint(RidePoint departurePoint);

    List<BigInteger> collectIdsByAnyDeparturePoint(Collection<RidePoint> departurePoints);

    List<BigInteger> collectIdsByArrivalPoint(RidePoint arrivalPoint);

    List<BigInteger> collectIdsByAnyArrivalPoint(Collection<RidePoint> arrivalPoints);

    List<BigInteger> collectIdsBySeat(Integer seat);

    List<BigInteger> collectIdsBySeatRange(Integer seatLeft, boolean strictLeft,
            Integer seatRight, boolean strictRight);

    List<BigInteger> collectIdsBySalesman(Salesman salesman);

    List<BigInteger> collectIdsByAnySalesman(Collection<Salesman> salesmen);

    List<BigInteger> collectIdsBySaleDateRange(DateTime saleDateLeft, boolean strictLeft,
            DateTime saleDateRight, boolean strictRight);

    List<BigInteger> collectIdsByCustomerName(String customerName);

    List<BigInteger> collectIdsByCustomerNameRegexp(String customerNameRegexp);

    List<BigInteger> collectIdsByPriceRange(BigDecimal priceLeft, boolean strictLeft,
            BigDecimal priceRight, boolean strictRight);

    List<BigInteger> collectIdsBySold(boolean sold);
}
