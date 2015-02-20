package com.anli.busstation.dal.interfaces.entities.vehicles;

import com.anli.busstation.dal.interfaces.entities.BSEntity;

public interface TechnicalState extends BSEntity {

    String getDescription();

    void setDescription(String description);

    Integer getDifficultyLevel();

    void setDifficultyLevel(Integer difficultyLevel);
}
