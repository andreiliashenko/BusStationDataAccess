package com.anli.busstation.dal.interfaces.providers.vehicles;

import com.anli.busstation.dal.interfaces.entities.vehicles.Bus;
import com.anli.busstation.dal.interfaces.entities.vehicles.Model;
import com.anli.busstation.dal.interfaces.entities.vehicles.TechnicalState;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface BusProvider extends BSEntityProvider<Bus> {

    List<Bus> findByModel(Model model);

    List<Bus> findByAnyModel(Collection<Model> models);

    List<Bus> findByState(TechnicalState state);

    List<Bus> findByAnyState(Collection<TechnicalState> states);

    List<Bus> findByPlate(String plate);

    List<BigInteger> collectIdsByModel(Model model);

    List<BigInteger> collectIdsByAnyModel(Collection<Model> models);

    List<BigInteger> collectIdsByState(TechnicalState state);

    List<BigInteger> collectIdsByAnyState(Collection<TechnicalState> states);

    List<BigInteger> collectIdsByPlate(String plate);
}
