package com.anli.busstation.dal.interfaces.entities.traffic;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import com.anli.busstation.dal.interfaces.entities.geography.Station;

public interface RoutePoint extends BSEntity {

    Station getStation();

    void setStation(Station station);
}
