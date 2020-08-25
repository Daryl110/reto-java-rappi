package com.rappi.tests.repositories;

import com.rappi.tests.models.Shopper;

public class ShopperRepository extends RepositoryStructure<Shopper> {

    public ShopperRepository() {
        super();
    }

    @Override
    public void add(Shopper shopper) {
        this.objectsMap.put(shopper.getShopperId(), shopper);
    }
}
