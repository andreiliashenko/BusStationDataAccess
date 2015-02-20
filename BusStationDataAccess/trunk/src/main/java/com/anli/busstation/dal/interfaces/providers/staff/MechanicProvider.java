package com.anli.busstation.dal.interfaces.providers.staff;

import com.anli.busstation.dal.interfaces.entities.staff.Mechanic;
import com.anli.busstation.dal.interfaces.entities.staff.MechanicSkill;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface MechanicProvider extends GenericEmployeeProvider<Mechanic> {

    List<Mechanic> findBySkill(MechanicSkill skill);

    List<Mechanic> findByAnySkill(Collection<MechanicSkill> skills);

    List<BigInteger> collectIdsBySkill(MechanicSkill skill);

    List<BigInteger> collectIdsByAnySkill(Collection<MechanicSkill> skills);
}
