package com.anli.busstation.dal.interfaces.providers.staff;

import com.anli.busstation.dal.interfaces.entities.staff.DriverSkill;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigInteger;
import java.util.List;

public interface DriverSkillProvider extends BSEntityProvider<DriverSkill> {

    List<DriverSkill> findByName(String name);

    List<DriverSkill> findByNameRegexp(String nameRegexp);

    List<DriverSkill> findByMaxRideLengthRange(Integer maxRideLengthLeft, boolean strictLeft,
            Integer maxRideLengthRight, boolean strictRight);

    List<DriverSkill> findByMaxPassengersRange(Integer maxPassengersLeft, boolean strictLeft,
            Integer maxPassengersRight, boolean strictRight);

    List<BigInteger> collectIdsByName(String name);

    List<BigInteger> collectIdsByNameRegexp(String nameRegexp);

    List<BigInteger> collectIdsByMaxRideLengthRange(Integer maxRideLengthLeft, boolean strictLeft,
            Integer maxRideLengthRight, boolean strictRight);

    List<BigInteger> collectIdsByMaxPassengersRange(Integer maxPassengersLeft, boolean strictLeft,
            Integer maxPassengersRight, boolean strictRight);
}
