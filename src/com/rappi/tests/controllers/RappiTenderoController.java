package com.rappi.tests.controllers;

import com.rappi.tests.models.RappiTendero;
import com.rappi.tests.repositories.RappiTenderoRepository;
import com.rappi.tests.services.EmpleadoService;

import java.util.Scanner;

public class RappiTenderoController {
    private final EmpleadoService<RappiTendero> rappiTenderoService;

    public RappiTenderoController() {
        rappiTenderoService = new EmpleadoService<>(new RappiTenderoRepository());
    }

    public void add() {
        System.out.println("Por favor digite los datos para crear el rappitendero");

        System.out.print("RappiTenderoId: ");
        String rappitenderoId = new Scanner(System.in).next();

        System.out.print("Nivel: ");
        String nivel = new Scanner(System.in).next();

        System.out.print("Ciudad: ");
        String ciudad = new Scanner(System.in).next();

        System.out.print("Pais: ");
        String pais = new Scanner(System.in).next();

        RappiTendero rappiTendero = new RappiTendero(
                rappitenderoId,
                nivel,
                ciudad,
                pais
        );

        this.rappiTenderoService.add(rappiTendero);

        System.out.println("\nRappitendero: " + rappiTendero.toString() + "\n");
    }

    public void findById() {
        String id = this.requestRappitenderoId("buscar");
        RappiTendero rappiTendero = this.rappiTenderoService.findById(id);
        this.showRappitenderoFound(id, rappiTendero);
    }

    public void showAll() {
        this.rappiTenderoService.showAll();
    }

    public void delete() {
        String id = this.requestRappitenderoId("eliminar");
        RappiTendero rappiTendero = this.rappiTenderoService.delete(id);
        this.showRappitenderoFound(id, rappiTendero);
    }

    private void showRappitenderoFound(String id, RappiTendero rappiTendero) {
        if(rappiTendero != null) System.out.println("\n" + rappiTendero.toString() + "\n");
        else System.out.println("\nNo se encontro ningun "+ RappiTendero.class.getSimpleName() +" con el { id: " + id + " }\n");
    }

    private String requestRappitenderoId(String action) {
        System.out.println("Digite el id del rappirtendero que desea " + action);
        System.out.print("RappiTenderoId: ");

        return new Scanner(System.in).next();
    }
}
