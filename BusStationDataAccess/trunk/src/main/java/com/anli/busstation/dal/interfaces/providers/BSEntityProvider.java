package com.anli.busstation.dal.interfaces.providers;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import java.math.BigInteger;
import java.util.List;

public interface BSEntityProvider<I extends BSEntity> {

    I create();

    I save(I entity);

    void remove(I entity);

    I findById(BigInteger id);

    List<I> findAll();

    List<BigInteger> collectIdsAll();
}
