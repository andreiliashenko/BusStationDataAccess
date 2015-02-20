package com.anli.busstation.dal.interfaces.entities.maintenance;

import com.anli.busstation.dal.interfaces.entities.vehicles.Bus;

public interface BusService extends TechnicalAssignment {

    Bus getBus();

    void setBus(Bus bus);
}
