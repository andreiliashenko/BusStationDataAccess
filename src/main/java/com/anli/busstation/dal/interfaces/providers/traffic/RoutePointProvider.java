package com.anli.busstation.dal.interfaces.providers.traffic;

import com.anli.busstation.dal.interfaces.entities.traffic.RoutePoint;
import com.anli.busstation.dal.interfaces.entities.geography.Station;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface RoutePointProvider extends BSEntityProvider<RoutePoint> {

    List<RoutePoint> findByStation(Station station);

    List<RoutePoint> findByAnyStation(Collection<Station> stations);

    List<BigInteger> collectIdsByStation(Station station);

    List<BigInteger> collectIdsByAnyStation(Collection<Station> stations);
}
