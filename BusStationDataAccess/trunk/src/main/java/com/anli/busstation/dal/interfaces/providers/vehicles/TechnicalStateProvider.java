package com.anli.busstation.dal.interfaces.providers.vehicles;

import com.anli.busstation.dal.interfaces.entities.vehicles.TechnicalState;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigInteger;
import java.util.List;

public interface TechnicalStateProvider extends BSEntityProvider<TechnicalState> {

    List<TechnicalState> findByDescriptionRegexp(String descrRegexp);

    List<TechnicalState> findByDifficultyLevel(Integer diffLevel);

    List<TechnicalState> findByDifficultyLevelRange(Integer dLLeft, boolean strictLeft,
            Integer dLRight, boolean strictRight);

    List<BigInteger> collectIdsByDescriptionRegexp(String descrRegexp);

    List<BigInteger> collectIdsByDifficultyLevel(Integer diffLevel);

    List<BigInteger> collectIdsByDifficultyLevelRange(Integer dLLeft, boolean strictLeft,
            Integer dLRight, boolean strictRight);
}
