package com.anli.busstation.dal.interfaces.providers.vehicles;

import com.anli.busstation.dal.interfaces.entities.vehicles.GasLabel;
import com.anli.busstation.dal.interfaces.entities.vehicles.Model;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface ModelProvider extends BSEntityProvider<Model> {

    List<Model> findByName(String name);

    List<Model> findByNameRegexp(String nameRegexp);

    List<Model> findBySeatsNumberRange(Integer seatsNumberLeft, boolean strictLeft,
            Integer seatsNumberRight, boolean strictRight);

    List<Model> findByTankVolumeRange(Integer tankVolumeLeft, boolean strictLeft,
            Integer tankVolumeRight, boolean strictRight);

    List<Model> findByGasLabel(GasLabel gasLabel);

    List<Model> findByAnyGasLabel(Collection<GasLabel> gasLabels);

    List<Model> findByGasRateRange(BigDecimal gasRateLeft, boolean strictLeft,
            BigDecimal gasRateRight, boolean strictRight);

    List<BigInteger> collectIdsByName(String name);

    List<BigInteger> collectIdsByNameRegexp(String nameRegexp);

    List<BigInteger> collectIdsBySeatsNumberRange(Integer seatsNumberLeft, boolean strictLeft,
            Integer seatsNumberRight, boolean strictRight);

    List<BigInteger> collectIdsByGasLabel(GasLabel gasLabel);

    List<BigInteger> collectIdsByAnyGasLabel(Collection<GasLabel> gasLabels);

    List<BigInteger> collectIdsByGasRateRange(BigDecimal gasRateLeft, boolean strictLeft,
            BigDecimal gasRateRight, boolean strictRight);

    List<BigInteger> collectIdsByTankVolumeRange(Integer tankVolumeLeft, boolean strictLeft,
            Integer tankVolumeRight, boolean strictRight);
}
