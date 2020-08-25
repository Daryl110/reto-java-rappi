package com.rappi.tests.controllers;

import com.rappi.tests.models.Shopper;
import com.rappi.tests.repositories.ShopperRepository;
import com.rappi.tests.services.EmpleadoService;

import java.util.Scanner;

public class ShopperController {
    private final EmpleadoService<Shopper> shopperService;

    public ShopperController() {
        this.shopperService = new EmpleadoService<>(new ShopperRepository());
    }

    public void add() {
        System.out.println("Por favor digite los datos para crear el shopper");

        System.out.print("ShopperId: ");
        String shopperId = new Scanner(System.in).next();

        System.out.print("Tienda: ");
        String tienda = new Scanner(System.in).next();

        Shopper shopper = new Shopper(
                shopperId,
                tienda
        );

        this.shopperService.add(shopper);

        System.out.println("\nShopper: " + shopper.toString() + "\n");
    }

    public void findById() {
        String id = this.requestShopperId("buscar");
        Shopper shopper = this.shopperService.findById(id);
        this.showShopperFound(id, shopper);
    }

    public void showAll() {
        this.shopperService.showAll();
    }

    public void delete() {
        String id = this.requestShopperId("eliminar");
        Shopper shopper = this.shopperService.delete(id);
        this.showShopperFound(id, shopper);
    }

    private void showShopperFound(String id, Shopper shopper) {
        if(shopper != null) System.out.println("\n" + shopper.toString() + "\n");
        else System.out.println("\nNo se encontro ningun "+ Shopper.class.getSimpleName() +" con el { id: " + id + " }\n");
    }

    private String requestShopperId(String action) {
        System.out.println("Digite el id del shopper que desea " + action);
        System.out.print("ShopperId: ");

        return new Scanner(System.in).next();
    }
}
