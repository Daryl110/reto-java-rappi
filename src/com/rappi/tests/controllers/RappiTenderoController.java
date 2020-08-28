package com.rappi.tests.controllers;

import com.rappi.tests.models.RappiTendero;
import com.rappi.tests.repositories.RappiTenderoRepository;
import com.rappi.tests.services.EmpleadoService;

import java.util.Scanner;

public class RappiTenderoController extends EmpleadoController<RappiTendero> {

  public RappiTenderoController() {
    this.empleadoService = new EmpleadoService<>(new RappiTenderoRepository());
  }

  public void add() {
    System.out.println("Por favor digite los datos para crear el rappitendero");
    Scanner scanner = new Scanner(System.in);

    System.out.print("RappiTenderoId: ");
    String rappitenderoId = scanner.next();

    System.out.print("Nivel: ");
    String nivel = scanner.next();

    System.out.print("Ciudad: ");
    String ciudad = scanner.next();

    System.out.print("Pais: ");
    String pais = scanner.next();

    RappiTendero rappiTendero = new RappiTendero(
        rappitenderoId,
        nivel,
        ciudad,
        pais
    );

    this.empleadoService.add(rappiTendero);

    System.out.println("\nRappitendero: " + rappiTendero.toString() + "\n");
  }

  public void findById() {
    String id = this.requestEmpleado("buscar");
    RappiTendero rappiTendero = this.empleadoService.findById(id);
    this.showEmpleadoFound(id, rappiTendero);
  }

  public void delete() {
    String id = this.requestEmpleado("eliminar");
    RappiTendero rappiTendero = this.empleadoService.delete(id);
    this.showEmpleadoFound(id, rappiTendero);
  }
}
