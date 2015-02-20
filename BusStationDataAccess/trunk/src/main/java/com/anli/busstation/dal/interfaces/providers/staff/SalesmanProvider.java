package com.anli.busstation.dal.interfaces.providers.staff;

import com.anli.busstation.dal.interfaces.entities.staff.Salesman;
import java.math.BigInteger;
import java.util.List;

public interface SalesmanProvider extends GenericEmployeeProvider<Salesman> {

    List<Salesman> findByTotalSalesRange(Integer leftSales, boolean strictLeft,
            Integer rightSales, boolean strictRight);

    List<BigInteger> collectIdsByTotalSalesRange(Integer leftSales, boolean strictLeft,
            Integer rightSales, boolean strictRight);
}
