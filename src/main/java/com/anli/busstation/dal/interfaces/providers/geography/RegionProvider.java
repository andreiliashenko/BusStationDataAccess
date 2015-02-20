package com.anli.busstation.dal.interfaces.providers.geography;

import com.anli.busstation.dal.interfaces.entities.geography.Region;
import com.anli.busstation.dal.interfaces.entities.geography.Station;
import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface RegionProvider extends BSEntityProvider<Region> {

    Region pullStations(Region region);

    List<Region> findByName(String name);

    List<Region> findByNameRegexp(String nameRegexp);

    List<Region> findByCode(Integer code);

    List<Region> findByAnyCode(Collection<Integer> codeList);

    List<Region> findByStation(Station station);

    List<Region> findByAnyStation(Collection<Station> stationList);

    List<BigInteger> collectIdsByName(String name);

    List<BigInteger> collectIdsByNameRegexp(String nameRegexp);

    List<BigInteger> collectIdsByCode(Integer code);

    List<BigInteger> collectIdsByAnyCode(Collection<Integer> codeList);

    List<BigInteger> collectIdsByStation(Station station);

    List<BigInteger> collectIdsByAnyStation(Collection<Station> stationList);
}
