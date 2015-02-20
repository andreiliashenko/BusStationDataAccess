package com.anli.busstation.dal.interfaces.providers.staff;

import com.anli.busstation.dal.interfaces.entities.staff.MechanicSkill;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigInteger;
import java.util.List;

public interface MechanicSkillProvider extends BSEntityProvider<MechanicSkill> {

    List<MechanicSkill> findByName(String name);

    List<MechanicSkill> findByNameRegexp(String nameRegexp);

    List<MechanicSkill> findByMaxDiffLevelRange(Integer mDLevelLeft, boolean leftStrict,
            Integer mDLevelRight, boolean rightStrict);

    List<BigInteger> collectIdsByName(String name);

    List<BigInteger> collectIdsByNameRegexp(String nameRegexp);

    List<BigInteger> collectIdsByMaxDiffLevelRange(Integer mDLevelLeft, boolean leftStrict,
            Integer mDLevelRight, boolean rightStrict);
}
