package com.anli.busstation.dal.interfaces.providers.staff;

import com.anli.busstation.dal.interfaces.entities.staff.Driver;
import com.anli.busstation.dal.interfaces.entities.staff.DriverSkill;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface DriverProvider extends GenericEmployeeProvider<Driver> {

    List<Driver> findBySkill(DriverSkill skill);

    List<Driver> findByAnySkill(Collection<DriverSkill> skills);

    List<BigInteger> collectIdsBySkill(DriverSkill skill);

    List<BigInteger> collectIdsByAnySkill(Collection<DriverSkill> skills);
}
