package com.anli.busstation.dal.interfaces.providers.traffic;

import com.anli.busstation.dal.interfaces.entities.staff.Driver;
import com.anli.busstation.dal.interfaces.entities.traffic.RideRoad;
import com.anli.busstation.dal.interfaces.entities.geography.Road;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface RideRoadProvider extends BSEntityProvider<RideRoad> {

    List<RideRoad> findByRoad(Road road);

    List<RideRoad> findByAnyRoad(Collection<Road> roadList);

    List<RideRoad> findByDriver(Driver driver);

    List<RideRoad> findByAnyDriver(Collection<Driver> driverList);

    List<BigInteger> collectIdsByRoad(Road road);

    List<BigInteger> collectIdsByAnyRoad(Collection<Road> roadList);

    List<BigInteger> collectIdsByDriver(Driver driver);

    List<BigInteger> collectIdsByAnyDriver(Collection<Driver> driverList);
}
