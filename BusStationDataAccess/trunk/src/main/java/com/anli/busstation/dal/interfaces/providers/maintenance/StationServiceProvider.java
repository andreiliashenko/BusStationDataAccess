package com.anli.busstation.dal.interfaces.providers.maintenance;

import com.anli.busstation.dal.interfaces.entities.maintenance.StationService;
import java.math.BigInteger;
import java.util.List;

public interface StationServiceProvider extends GenericTechnicalAssignmentProvider<StationService> {

    List<StationService> findByDescriptionRegexp(String descrRegexp);

    List<BigInteger> collectIdsByDescriptionRegexp(String descrRegexp);
}
