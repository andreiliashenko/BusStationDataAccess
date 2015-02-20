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

    List<Ticket> findByDeparturePoint(RidePoint point);

    List<Ticket> findByAnyDeparturePoint(Collection<RidePoint> pointList);

    List<Ticket> findByArrivalPoint(RidePoint point);

    List<Ticket> findByAnyArrivalPoint(Collection<RidePoint> pointList);

    List<Ticket> findBySeat(Integer seat);

    List<Ticket> findBySeatRange(Integer seatLeft, boolean strictLeft,
            Integer seatRight, boolean strictRight);

    List<Ticket> findBySalesman(Salesman salesman);

    List<Ticket> findByAnySalesman(Collection<Salesman> salesmenList);

    List<Ticket> findBySaleDateRange(DateTime dateLeft, boolean strictLeft,
            DateTime dateRight, boolean strictRight);

    List<Ticket> findByCustomerName(String custName);

    List<Ticket> findByCustomerNameRegexp(String custNameRegexp);

    List<Ticket> findByPriceRange(BigDecimal priceLeft, boolean strictLeft,
            BigDecimal priceRight, boolean strictRight);

    List<Ticket> findBySold(boolean sold);

    List<BigInteger> collectIdsByDeparturePoint(RidePoint point);

    List<BigInteger> collectIdsByAnyDeparturePoint(Collection<RidePoint> pointList);

    List<BigInteger> collectIdsByArrivalPoint(RidePoint point);

    List<BigInteger> collectIdsByAnyArrivalPoint(Collection<RidePoint> pointList);

    List<BigInteger> collectIdsBySeat(Integer seat);

    List<BigInteger> collectIdsBySeatRange(Integer seatLeft, boolean strictLeft,
            Integer seatRight, boolean strictRight);

    List<BigInteger> collectIdsBySalesman(Salesman salesman);

    List<BigInteger> collectIdsByAnySalesman(Collection<Salesman> salesmenList);

    List<BigInteger> collectIdsBySaleDateRange(DateTime dateLeft, boolean strictLeft,
            DateTime dateRight, boolean strictRight);

    List<BigInteger> collectIdsByCustomerName(String custName);

    List<BigInteger> collectIdsByCustomerNameRegexp(String custNameRegexp);

    List<BigInteger> collectIdsByPriceRange(BigDecimal priceLeft, boolean strictLeft,
            BigDecimal priceRight, boolean strictRight);

    List<BigInteger> collectIdsBySold(boolean sold);
}
