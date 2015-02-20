package com.anli.busstation.dal.interfaces.providers.maintenance;

import com.anli.busstation.dal.interfaces.entities.vehicles.Bus;
import com.anli.busstation.dal.interfaces.entities.maintenance.BusService;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface GenericBusServiceProvider<I extends BusService> extends GenericTechnicalAssignmentProvider<I> {

    List<I> findByBus(Bus bus);

    List<I> findByAnyBus(Collection<Bus> buses);

    List<BigInteger> collectIdsByBus(Bus bus);

    List<BigInteger> collectIdsByAnyBus(Collection<Bus> buses);
}
