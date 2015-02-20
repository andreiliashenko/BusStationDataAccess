package com.anli.busstation.dal.interfaces.providers.maintenance;

import com.anli.busstation.dal.interfaces.entities.maintenance.BusRefuelling;
import java.math.BigInteger;
import java.util.List;

public interface BusRefuellingProvider extends GenericBusServiceProvider<BusRefuelling> {

    List<BusRefuelling> findByVolumeRange(Integer gasVolumeLeft, boolean leftStrict,
            Integer gasVolumeRight, boolean rightStrict);

    List<BigInteger> collectIdsByVolumeRange(Integer gasVolumeLeft, boolean leftStrict,
            Integer gasVolumeRight, boolean rightStrict);
}
