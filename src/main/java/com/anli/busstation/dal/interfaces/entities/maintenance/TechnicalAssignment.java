package com.anli.busstation.dal.interfaces.entities.maintenance;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import com.anli.busstation.dal.interfaces.entities.staff.Mechanic;
import java.math.BigDecimal;
import org.joda.time.DateTime;

public interface TechnicalAssignment extends BSEntity {

    Mechanic getMechanic();

    void setMechanic(Mechanic mechanic);

    DateTime getBeginTime();

    void setBeginTime(DateTime beginTime);

    DateTime getEndTime();

    void setEndTime(DateTime endTime);

    BigDecimal getServiceCost();

    void setServiceCost(BigDecimal serviceCost);
}
