package com.anli.busstation.dal.interfaces.providers.maintenance;

import com.anli.busstation.dal.interfaces.entities.staff.Mechanic;
import com.anli.busstation.dal.interfaces.entities.maintenance.TechnicalAssignment;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import org.joda.time.DateTime;

public interface GenericTechnicalAssignmentProvider<I extends TechnicalAssignment> extends BSEntityProvider<I> {

    List<I> findByMechanic(Mechanic mechanic);

    List<I> findByAnyMechanic(Collection<Mechanic> mechList);

    List<I> findByBeginTimeRange(DateTime leftBT, boolean strictLeft,
            DateTime rightBT, boolean strictRight);

    List<I> findByEndTimeRange(DateTime leftET, boolean strictLeft,
            DateTime rightET, boolean strictRight);

    List<I> findByServiceCostRange(BigDecimal leftCost, boolean strictLeft,
            BigDecimal rightCost, boolean strictRight);

    List<BigInteger> collectIdsByMechanic(Mechanic mechanic);

    List<BigInteger> collectIdsByAnyMechanic(Collection<Mechanic> mechList);

    List<BigInteger> collectIdsByBeginTimeRange(DateTime leftBT, boolean strictLeft,
            DateTime rightBT, boolean strictRight);

    List<BigInteger> collectIdsByEndTimeRange(DateTime leftET, boolean strictLeft,
            DateTime rightET, boolean strictRight);

    List<BigInteger> collectIdsByServiceCostRange(BigDecimal leftCost, boolean strictLeft,
            BigDecimal rightCost, boolean strictRight);
}
