package com.anli.busstation.dal.interfaces.entities.staff;

import com.anli.busstation.dal.interfaces.entities.BSEntity;

public interface DriverSkill extends BSEntity {

    String getName();

    void setName(String name);

    Integer getMaxRideLength();

    void setMaxRideLength(Integer maxRideLength);

    Integer getMaxPassengers();

    void setMaxPassengers(Integer maxPassengers);
}
