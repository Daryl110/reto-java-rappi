package com.rappi.tests.services;

import com.rappi.tests.models.Empleado;
import com.rappi.tests.repositories.EmpleadoRepository;

import java.util.Scanner;

public class EmpleadoService<T> {
  private final EmpleadoRepository<T> empleadoRepository;

  public EmpleadoService(EmpleadoRepository<T> empleadoRepository) {
    this.empleadoRepository = empleadoRepository;
  }

  public void add(Empleado object) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nombre: ");
    String nombre = scanner.next();
    object.setNombre(nombre);

    System.out.print("Apellido: ");
    String apellido = scanner.next();
    object.setApellido(apellido);

    System.out.print("Documento de Identidad: ");
    String documentoIdentidad = scanner.next();
    object.setDocumentoIdentidad(documentoIdentidad);

    System.out.print("Edad: ");
    int edad = scanner.nextInt();
    object.setEdad(edad);

    this.empleadoRepository.add((T) object);
  }

  public T findById(String id) {
    try {

      return this.empleadoRepository.findById(id);
    } catch (NullPointerException e) {

      return null;
    }
  }

  public void showAll() {
    this.empleadoRepository.showAll();
  }

  public T delete(String id) {
    try {

      return this.empleadoRepository.delete(id);
    } catch (NullPointerException e) {

      return null;
    }
  }
}
