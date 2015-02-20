package com.anli.busstation.dal.interfaces.entities.geography;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import com.anli.busstation.dal.interfaces.entities.vehicles.Bus;
import com.anli.busstation.dal.interfaces.entities.staff.Employee;
import java.math.BigDecimal;
import java.util.List;

public interface Station extends BSEntity {

    String getName();

    void setName(String name);

    BigDecimal getLatitude();

    void setLatitude(BigDecimal latitude);

    BigDecimal getLongitude();

    void setLongitude(BigDecimal longitude);

    List<Employee> getEmployees();

    List<Bus> getBuses();
}
