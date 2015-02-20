package com.anli.busstation.dal.interfaces.entities.staff;

import com.anli.busstation.dal.interfaces.entities.BSEntity;

public interface MechanicSkill extends BSEntity {

    String getName();

    void setName(String name);

    Integer getMaxDiffLevel();

    void setMaxDiffLevel(Integer maxDiffLevel);
}
