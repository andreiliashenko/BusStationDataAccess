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

    List<Model> findBySeatsNumberRange(Integer seatsLeft, boolean strictLeft,
            Integer seatsRight, boolean strictRight);

    List<Model> findByTankVolumeRange(Integer tvLeft, boolean strictLeft,
            Integer tvRight, boolean strictRight);

    List<Model> findByGasLabel(GasLabel label);

    List<Model> findByAnyGasLabel(Collection<GasLabel> labelList);

    List<Model> findByGasRateRange(BigDecimal rateLeft, boolean strictLeft,
            BigDecimal rateRight, boolean strictRight);

    List<BigInteger> collectIdsByName(String name);

    List<BigInteger> collectIdsByNameRegexp(String nameRegexp);

    List<BigInteger> collectIdsBySeatsNumberRange(Integer seatsLeft, boolean strictLeft,
            Integer seatsRight, boolean strictRight);

    List<BigInteger> collectIdsByGasLabel(GasLabel label);

    List<BigInteger> collectIdsByAnyGasLabel(Collection<GasLabel> labelList);

    List<BigInteger> collectIdsByGasRateRange(BigDecimal rateLeft, boolean strictLeft,
            BigDecimal rateRight, boolean strictRight);

    List<BigInteger> collectIdsByTankVolumeRange(Integer tvLeft, boolean strictLeft,
            Integer tvRight, boolean strictRight);
}
