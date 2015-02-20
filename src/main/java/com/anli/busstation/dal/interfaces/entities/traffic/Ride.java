package com.anli.busstation.dal.interfaces.entities.traffic;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import com.anli.busstation.dal.interfaces.entities.vehicles.Bus;
import java.util.List;

public interface Ride extends BSEntity {

    Bus getBus();

    void setBus(Bus bus);

    List<RidePoint> getRidePoints();

    List<RideRoad> getRideRoads();

    List<Ticket> getTickets();
}
