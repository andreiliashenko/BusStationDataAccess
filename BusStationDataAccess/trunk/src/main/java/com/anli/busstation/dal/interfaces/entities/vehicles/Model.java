package com.anli.busstation.dal.interfaces.entities.vehicles;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import java.math.BigDecimal;

public interface Model extends BSEntity {

    String getName();

    void setName(String name);

    Integer getSeatsNumber();

    void setSeatsNumber(Integer seatsNumber);

    Integer getTankVolume();

    void setTankVolume(Integer tankVolume);

    GasLabel getGasLabel();

    void setGasLabel(GasLabel gasLabel);

    BigDecimal getGasRate();

    void setGasRate(BigDecimal gasRate);
}
