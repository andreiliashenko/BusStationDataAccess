package com.anli.busstation.dal.interfaces.providers.geography;

import com.anli.busstation.dal.interfaces.entities.geography.Road;
import com.anli.busstation.dal.interfaces.entities.geography.Station;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface RoadProvider extends BSEntityProvider<Road> {

    List<Road> findByAStation(Station aStation);

    List<Road> findByAnyAStation(Collection<Station> aStationList);

    List<Road> findByZStation(Station zStation);

    List<Road> findByAnyZStation(Collection<Station> zStationList);

    List<Road> findByStation(Station station);

    List<Road> findByAnyStation(Collection<Station> stationList);

    List<Road> findByLengthRange(Integer lengthLeft, boolean strictLeft,
            Integer lengthRight, boolean strictRight);

    List<Road> findByRidePriceRange(BigDecimal rPriceLeft, boolean strictLeft,
            BigDecimal rPriceRight, boolean strictRight);

    List<BigInteger> collectIdsByAStation(Station aStation);

    List<BigInteger> collectIdsByAnyAStation(Collection<Station> aStationList);

    List<BigInteger> collectIdsByZStation(Station zStation);

    List<BigInteger> collectIdsByAnyZStation(Collection<Station> zStationList);

    List<BigInteger> collectIdsByStation(Station station);

    List<BigInteger> collectIdsByAnyStation(Collection<Station> stationList);

    List<BigInteger> collectIdsByLengthRange(Integer lengthLeft, boolean strictLeft,
            Integer lengthRight, boolean strictRight);

    List<BigInteger> collectIdsByRidePriceRange(BigDecimal rPriceLeft, boolean strictLeft,
            BigDecimal rPriceRight, boolean strictRight);
}
