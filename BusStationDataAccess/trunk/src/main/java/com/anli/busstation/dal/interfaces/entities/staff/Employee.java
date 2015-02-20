package com.anli.busstation.dal.interfaces.entities.staff;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import java.math.BigDecimal;
import org.joda.time.DateTime;

public interface Employee extends BSEntity {

    String getName();

    void setName(String name);

    BigDecimal getSalary();

    void setSalary(BigDecimal salary);

    DateTime getHiringDate();

    void setHiringDate(DateTime hiringDate);
}
