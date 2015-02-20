package com.anli.busstation.dal.interfaces.providers.geography;

import com.anli.busstation.dal.interfaces.entities.vehicles.Bus;
import com.anli.busstation.dal.interfaces.entities.staff.Employee;
import com.anli.busstation.dal.interfaces.entities.geography.Station;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface StationProvider extends BSEntityProvider<Station> {

    Station pullEmployees(Station station);

    Station pullBuses(Station station);

    List<Station> findByName(String name);

    List<Station> findByNameRegexp(String regexpName);

    List<Station> findByLatitudeRange(BigDecimal leftLat, boolean strictLeft,
            BigDecimal rightLat, boolean strictRight);

    List<Station> findByLongitudeRange(BigDecimal leftLon, boolean strictLeft,
            BigDecimal rightLon, boolean strictRight);

    List<Station> findByEmployee(Employee employee);

    List<Station> findByAnyEmployee(Collection<Employee> employeeList);

    List<Station> findByBus(Bus bus);

    List<Station> findByAnyBus(Collection<Bus> busList);

    List<BigInteger> collectIdsByName(String name);

    List<BigInteger> collectIdsByNameRegexp(String regexpName);

    List<BigInteger> collectIdsByLatitudeRange(BigDecimal leftLat, boolean strictLeft,
            BigDecimal rightLat, boolean strictRight);

    List<BigInteger> collectIdsByLongitudeRange(BigDecimal leftLon, boolean strictLeft,
            BigDecimal rightLon, boolean strictRight);

    List<BigInteger> collectIdsByEmployee(Employee employee);

    List<BigInteger> collectIdsByAnyEmployee(Collection<Employee> employeeList);

    List<BigInteger> collectIdsByBus(Bus bus);

    List<BigInteger> collectIdsByAnyBus(Collection<Bus> busList);
}
