package com.anli.busstation.dal.interfaces.entities;

import java.io.Serializable;
import java.math.BigInteger;

public interface BSEntity extends Serializable {

    BigInteger getId();

    @Deprecated
    boolean deepEquals(BSEntity comparee);
}
