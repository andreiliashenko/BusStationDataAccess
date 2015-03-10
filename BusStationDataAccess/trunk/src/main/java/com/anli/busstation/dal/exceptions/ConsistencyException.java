package com.anli.busstation.dal.exceptions;

import com.anli.busstation.dal.interfaces.entities.BSEntity;
import java.util.Collection;

public class ConsistencyException extends RuntimeException {

    protected Collection<BSEntity> inconsistentEntities;

    public ConsistencyException(Collection<BSEntity> inconsistentEntities, Throwable cause) {
        super(cause);
        this.inconsistentEntities = inconsistentEntities;
    }
}
