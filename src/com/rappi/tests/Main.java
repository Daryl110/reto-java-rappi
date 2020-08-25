package com.rappi.tests;

import com.rappi.tests.controllers.RappiTenderoController;
import com.rappi.tests.controllers.ShopperController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean finalizeProgram = false;
        RappiTenderoController ctlRappiTendero = new RappiTenderoController();
        ShopperController ctlShopper = new ShopperController();

        do {
            System.out.println("Ingrese el numero de la accion que desea ralizar:" +
                    "\n1. Agregar RappiTendero" +
                    "\n2. Agregar Shopper" +
                    "\n3. Buscar RappiTendero por id" +
                    "\n4. Buscar Shopper por id" +
                    "\n5. Mostrar lista de shoppers" +
                    "\n6. Mostrar lista de rappitenderos" +
                    "\n7. Eliminar shopper por id" +
                    "\n8. Eliminar rappitendero por id" +
                    "\n\n9. exit");

            int option = new Scanner(System.in).nextInt();

            switch (option) {
                case 1 -> {
                    ctlRappiTendero.add();
                    exitProgram();
                }
                case 2 -> {
                    ctlShopper.add();
                    exitProgram();
                }
                case 3 -> {
                    ctlRappiTendero.findById();
                    exitProgram();
                }
                case 4 -> {
                    ctlShopper.findById();
                    exitProgram();
                }
                case 5 -> {
                    ctlShopper.showAll();
                    exitProgram();
                }
                case 6 -> {
                    ctlRappiTendero.showAll();
                    exitProgram();
                }
                case 7 -> {
                    ctlShopper.delete();
                    exitProgram();
                }
                case 8 -> {
                    ctlRappiTendero.delete();
                    exitProgram();
                }
                case 9 -> {
                    finalizeProgram = true;
                    System.out.println("ADIOS!!!");
                }
                default -> {
                    System.out.println("por favor seleccione una opcion valida");
                    exitProgram();
                }
            }

            System.out.flush();
        } while (!finalizeProgram);
    }

    private static void exitProgram() {
        System.out.println("desea seguir realizando operaciones? S/N");
        String option = new Scanner(System.in).next();
        if (option.equalsIgnoreCase("n")
                || !option.equalsIgnoreCase("s")) {
            System.out.println("ADIOS!!!");
            System.exit(0);
        }
    }
}
