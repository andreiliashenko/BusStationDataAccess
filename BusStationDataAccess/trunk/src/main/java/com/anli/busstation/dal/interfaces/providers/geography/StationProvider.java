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

    List<Station> findByLatitudeRange(BigDecimal latitudeLeft, boolean strictLeft,
            BigDecimal latitudeRight, boolean strictRight);

    List<Station> findByLongitudeRange(BigDecimal longitudeLeft, boolean strictLeft,
            BigDecimal longitudeRight, boolean strictRight);

    List<Station> findByEmployee(Employee employee);

    List<Station> findByAnyEmployee(Collection<Employee> employees);

    List<Station> findByBus(Bus bus);

    List<Station> findByAnyBus(Collection<Bus> buses);

    List<BigInteger> collectIdsByName(String name);

    List<BigInteger> collectIdsByNameRegexp(String regexpName);

    List<BigInteger> collectIdsByLatitudeRange(BigDecimal latitudeLeft, boolean strictLeft,
            BigDecimal latitudeRight, boolean strictRight);

    List<BigInteger> collectIdsByLongitudeRange(BigDecimal longitudeLeft, boolean strictLeft,
            BigDecimal longitudeRight, boolean strictRight);

    List<BigInteger> collectIdsByEmployee(Employee employee);

    List<BigInteger> collectIdsByAnyEmployee(Collection<Employee> employees);

    List<BigInteger> collectIdsByBus(Bus bus);

    List<BigInteger> collectIdsByAnyBus(Collection<Bus> buses);
}
