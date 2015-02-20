package com.anli.busstation.dal.interfaces.entities.vehicles;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import java.math.BigDecimal;

public interface GasLabel extends BSEntity {

    String getName();

    void setName(String name);

    BigDecimal getPrice();

    void setPrice(BigDecimal price);
}
