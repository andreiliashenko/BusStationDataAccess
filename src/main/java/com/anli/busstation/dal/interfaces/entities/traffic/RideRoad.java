package com.anli.busstation.dal.interfaces.entities.traffic;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import com.anli.busstation.dal.interfaces.entities.staff.Driver;
import com.anli.busstation.dal.interfaces.entities.geography.Road;

public interface RideRoad extends BSEntity {

    Road getRoad();

    void setRoad(Road road);

    Driver getDriver();

    void setDriver(Driver driver);
}
