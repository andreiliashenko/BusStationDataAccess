package com.anli.busstation.dal.interfaces.providers.vehicles;

import com.anli.busstation.dal.interfaces.entities.vehicles.TechnicalState;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigInteger;
import java.util.List;

public interface TechnicalStateProvider extends BSEntityProvider<TechnicalState> {

    List<TechnicalState> findByDescriptionRegexp(String descriptionRegexp);

    List<TechnicalState> findByDifficultyLevel(Integer difficultyLevel);

    List<TechnicalState> findByDifficultyLevelRange(Integer difficultyLevelLeft, boolean strictLeft,
            Integer difficultyLevelRight, boolean strictRight);

    List<BigInteger> collectIdsByDescriptionRegexp(String descriptionRegexp);

    List<BigInteger> collectIdsByDifficultyLevel(Integer difficultyLevel);

    List<BigInteger> collectIdsByDifficultyLevelRange(Integer difficultyLevelLeft, boolean strictLeft,
            Integer difficultyLevelRight, boolean strictRight);
}
