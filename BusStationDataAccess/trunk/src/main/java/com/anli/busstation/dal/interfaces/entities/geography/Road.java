package com.anli.busstation.dal.interfaces.entities.geography;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import java.math.BigDecimal;

public interface Road extends BSEntity {

    Station getAStation();

    void setAStation(Station aStation);

    Station getZStation();

    void setZStation(Station zStation);

    Integer getLength();

    void setLength(Integer length);

    BigDecimal getRidePrice();

    void setRidePrice(BigDecimal ridePrice);
}
