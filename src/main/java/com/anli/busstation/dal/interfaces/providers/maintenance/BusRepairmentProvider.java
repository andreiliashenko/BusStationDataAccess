package com.anli.busstation.dal.interfaces.providers.maintenance;

import com.anli.busstation.dal.interfaces.entities.maintenance.BusRepairment;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public interface BusRepairmentProvider extends GenericBusServiceProvider<BusRepairment> {

    List<BusRepairment> findByExpendablesPriceRange(BigDecimal exPriceLeft, boolean leftStrict,
            BigDecimal exPriceRight, boolean rightStrict);

    List<BigInteger> collectIdsByExpendablesPriceRange(BigDecimal exPriceLeft, boolean leftStrict,
            BigDecimal exPriceRight, boolean rightStrict);
}
