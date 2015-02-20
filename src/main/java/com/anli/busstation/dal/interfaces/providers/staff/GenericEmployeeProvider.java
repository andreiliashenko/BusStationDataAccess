package com.anli.busstation.dal.interfaces.providers.staff;

import com.anli.busstation.dal.interfaces.entities.staff.Employee;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import org.joda.time.DateTime;

public interface GenericEmployeeProvider<I extends Employee> extends BSEntityProvider<I> {

    List<I> findByName(String name);

    List<I> findByNameRegexp(String nameRegexp);

    List<I> findBySalaryRange(BigDecimal salaryLeft, boolean leftStrict,
            BigDecimal salaryRight, boolean rightStrict);

    List<I> findByHiringDateRange(DateTime hdLeft, boolean strictLeft,
            DateTime hdRight, boolean strictRight);

    List<BigInteger> collectIdsByName(String name);

    List<BigInteger> collectIdsByNameRegexp(String nameRegexp);

    List<BigInteger> collectIdsBySalaryRange(BigDecimal salaryLeft, boolean leftStrict,
            BigDecimal salaryRight, boolean rightStrict);

    List<BigInteger> collectIdsByHiringDateRange(DateTime hdLeft, boolean strictLeft,
            DateTime hdRight, boolean strictRight);
}
