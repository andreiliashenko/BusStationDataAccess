package com.anli.busstation.dal.interfaces.providers.maintenance;

import com.anli.busstation.dal.interfaces.entities.staff.Mechanic;
import com.anli.busstation.dal.interfaces.entities.maintenance.TechnicalAssignment;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import org.joda.time.DateTime;

public interface GenericTechnicalAssignmentProvider<I extends TechnicalAssignment>
        extends BSEntityProvider<I> {

    List<I> findByMechanic(Mechanic mechanic);

    List<I> findByAnyMechanic(Collection<Mechanic> mechanics);

    List<I> findByBeginTimeRange(DateTime beginTimeLeft, boolean strictLeft,
            DateTime beginTimeRight, boolean strictRight);

    List<I> findByEndTimeRange(DateTime endTimeLeft, boolean strictLeft,
            DateTime endTimeRight, boolean strictRight);

    List<I> findByServiceCostRange(BigDecimal serviceCostLeft, boolean strictLeft,
            BigDecimal sericeCostRight, boolean strictRight);

    List<BigInteger> collectIdsByMechanic(Mechanic mechanic);

    List<BigInteger> collectIdsByAnyMechanic(Collection<Mechanic> mechanics);

    List<BigInteger> collectIdsByBeginTimeRange(DateTime beginTimeLeft, boolean strictLeft,
            DateTime beginTimeRight, boolean strictRight);

    List<BigInteger> collectIdsByEndTimeRange(DateTime endTimeLeft, boolean strictLeft,
            DateTime endTimeRight, boolean strictRight);

    List<BigInteger> collectIdsByServiceCostRange(BigDecimal serviceCostLeft, boolean strictLeft,
            BigDecimal sericeCostRight, boolean strictRight);
}
