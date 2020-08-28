package com.rappi.tests.controllers;

import com.rappi.tests.models.Shopper;
import com.rappi.tests.repositories.ShopperRepository;
import com.rappi.tests.services.EmpleadoService;

import java.util.Scanner;

public class ShopperController extends EmpleadoController<Shopper> {

  public ShopperController() {
    this.empleadoService = new EmpleadoService<>(new ShopperRepository());
  }

  public void add() {
    System.out.println("Por favor digite los datos para crear el shopper");
    Scanner scanner = new Scanner(System.in);

    System.out.print("ShopperId: ");
    String shopperId = scanner.next();

    System.out.print("Tienda: ");
    String tienda = scanner.next();

    Shopper shopper = new Shopper(
        shopperId,
        tienda
    );

    this.empleadoService.add(shopper);

    System.out.println("\nShopper: " + shopper.toString() + "\n");
  }

  public void findById() {
    String id = this.requestEmpleado("buscar");
    Shopper shopper = this.empleadoService.findById(id);
    this.showEmpleadoFound(id, shopper);
  }

  public void delete() {
    String id = this.requestEmpleado("eliminar");
    Shopper shopper = this.empleadoService.delete(id);
    this.showEmpleadoFound(id, shopper);
  }
}
