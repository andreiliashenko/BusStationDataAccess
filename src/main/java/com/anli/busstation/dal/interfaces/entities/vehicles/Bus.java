package com.anli.busstation.dal.interfaces.entities.vehicles;

import com.anli.busstation.dal.interfaces.entities.BSEntity;

public interface Bus extends BSEntity {

    Model getModel();

    void setModel(Model model);

    TechnicalState getState();

    void setState(TechnicalState state);

    String getPlate();

    void setPlate(String plate);
}
