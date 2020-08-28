package com.rappi.tests.repositories;

import com.rappi.tests.models.RappiTendero;

public class RappiTenderoRepository extends EmpleadoRepository<RappiTendero> {

  public RappiTenderoRepository() {
    super();
  }

  @Override
  public void add(RappiTendero rappiTendero) {
    this.objectsMap.put(rappiTendero.getRappiTenderoId(), rappiTendero);
  }
}
