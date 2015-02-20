package com.anli.busstation.dal.interfaces.providers.traffic;

import com.anli.busstation.dal.interfaces.entities.vehicles.Bus;
import com.anli.busstation.dal.interfaces.entities.traffic.Ride;
import com.anli.busstation.dal.interfaces.entities.traffic.RidePoint;
import com.anli.busstation.dal.interfaces.entities.traffic.RideRoad;
import com.anli.busstation.dal.interfaces.entities.traffic.Ticket;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface RideProvider extends BSEntityProvider<Ride> {

    Ride pullRidePoints(Ride ride);

    Ride pullRideRoads(Ride ride);

    Ride pullTickets(Ride ride);

    List<Ride> findByBus(Bus bus);

    List<Ride> findByAnyBus(Collection<Bus> busList);

    List<Ride> findByRidePoint(RidePoint ridePoint);

    List<Ride> findByAnyRidePoint(Collection<RidePoint> ridePointList);

    List<Ride> findByRideRoad(RideRoad rideRoad);

    List<Ride> findByAnyRideRoad(Collection<RideRoad> rideRoadList);

    List<Ride> findByTicket(Ticket ticket);

    List<Ride> findByAnyTicket(Collection<Ticket> ticketList);

    List<BigInteger> collectIdsByBus(Bus bus);

    List<BigInteger> collectIdsByAnyBus(Collection<Bus> busList);

    List<BigInteger> collectIdsByRidePoint(RidePoint ridePoint);

    List<BigInteger> collectIdsByAnyRidePoint(Collection<RidePoint> ridePointList);

    List<BigInteger> collectIdsByRideRoad(RideRoad rideRoad);

    List<BigInteger> collectIdsByAnyRideRoad(Collection<RideRoad> rideRoadList);

    List<BigInteger> collectIdsByTicket(Ticket ticket);

    List<BigInteger> collectIdsByAnyTicket(Collection<Ticket> ticketList);
}
