package com.anli.busstation.dal.interfaces.factories;

import com.anli.busstation.dal.interfaces.providers.BSEntityProvider;

public interface ProviderFactory {

    <I extends BSEntityProvider> I getProvider(Class<I> abstraction);
}
