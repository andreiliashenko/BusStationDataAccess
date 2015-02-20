package com.anli.busstation.dal.interfaces.providers.staff;

import com.anli.busstation.dal.interfaces.entities.staff.DriverSkill;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigInteger;
import java.util.List;

public interface DriverSkillProvider extends BSEntityProvider<DriverSkill> {

    List<DriverSkill> findByName(String name);

    List<DriverSkill> findByNameRegexp(String regexpName);

    List<DriverSkill> findByMaxRideLengthRange(Integer mRLLeft, boolean strictLeft,
            Integer mRLRight, boolean strictRight);

    List<DriverSkill> findByMaxPassengersRange(Integer maxPLeft, boolean strictLeft,
            Integer maxPRight, boolean strictRight);

    List<BigInteger> collectIdsByName(String name);

    List<BigInteger> collectIdsByNameRegexp(String regexpName);

    List<BigInteger> collectIdsByMaxRideLengthRange(Integer mRLLeft, boolean strictLeft,
            Integer mRLRight, boolean strictRight);

    List<BigInteger> collectIdsByMaxPassengersRange(Integer maxPLeft, boolean strictLeft,
            Integer maxPRight, boolean strictRight);
}
