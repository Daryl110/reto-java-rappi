package com.rappi.tests.controllers;

import com.rappi.tests.models.Empleado;
import com.rappi.tests.services.EmpleadoService;

import java.lang.reflect.ParameterizedType;
import java.util.Scanner;

public class EmpleadoController<T> {

  private final String className;
  protected EmpleadoService<T> empleadoService;

  public EmpleadoController() {
    this.className = (
        (
            (ParameterizedType) this.getClass().getGenericSuperclass()
        ).getActualTypeArguments()[0]
    ).getTypeName().split("\\.")[4];
  }

  public void showAll() {
    this.empleadoService.showAll();
  }

  protected void showEmpleadoFound(String id, Empleado empleado) {
    if (empleado != null) System.out.println("\n" + empleado.toString() + "\n");
    else System.out.println("\nNo se encontro ningun " + this.className + " con el { id: " + id + " }\n");
  }

  protected String requestEmpleado(String action) {
    System.out.println("Digite el id del " + this.className + " que desea " + action);
    System.out.print(this.className + "Id: ");

    return new Scanner(System.in).next();
  }
}
