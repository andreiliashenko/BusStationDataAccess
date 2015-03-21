package com.anli.busstation.dal.interfaces.providers.vehicles;

import com.anli.busstation.dal.interfaces.entities.vehicles.GasLabel;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public interface GasLabelProvider extends BSEntityProvider<GasLabel> {

    List<GasLabel> findByName(String name);

    List<GasLabel> findByNameRegexp(String nameRegexp);

    List<GasLabel> findByPriceRange(BigDecimal priceLeft, boolean leftStrict,
            BigDecimal priceRight, boolean rightStrict);

    List<BigInteger> collectIdsByName(String name);

    List<BigInteger> collectIdsByNameRegexp(String nameRegexp);

    List<BigInteger> collectIdsByPriceRange(BigDecimal priceLeft, boolean leftStrict,
            BigDecimal priceRight, boolean rightStrict);
}
