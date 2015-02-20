package com.anli.busstation.dal.interfaces.entities.maintenance;

import java.math.BigDecimal;

public interface BusRepairment extends BusService {

    BigDecimal getExpendablesPrice();

    void setExpendablesPrice(BigDecimal expendablesPrice);
}
