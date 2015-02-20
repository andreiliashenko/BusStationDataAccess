package com.anli.busstation.dal.interfaces.entities.maintenance;

public interface BusRefuelling extends BusService {

    Integer getVolume();

    void setVolume(Integer volume);
}
