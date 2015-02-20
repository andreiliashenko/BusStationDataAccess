package com.anli.busstation.dal.interfaces.entities.geography;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import java.util.List;

public interface Region extends BSEntity {

    String getName();

    void setName(String name);

    Integer getCode();

    void setCode(Integer code);

    List<Station> getStations();
}
