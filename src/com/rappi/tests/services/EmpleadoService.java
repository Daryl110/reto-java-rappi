package com.rappi.tests.services;

import com.rappi.tests.models.Empleado;
import com.rappi.tests.repositories.RepositoryStructure;

import java.util.Scanner;

public class EmpleadoService<T> {
    private final RepositoryStructure<T> repositoryStructure;

    public EmpleadoService(RepositoryStructure<T> repositoryStructure) {
        this.repositoryStructure = repositoryStructure;
    }

    public void add(Empleado object) {
        System.out.print("Nombre: ");
        String nombre = new Scanner(System.in).next();
        object.setNombre(nombre);

        System.out.print("Apellido: ");
        String apellido = new Scanner(System.in).next();
        object.setApellido(apellido);

        System.out.print("Documento de Identidad: ");
        String documentoIdentidad = new Scanner(System.in).next();
        object.setDocumentoIdentidad(documentoIdentidad);

        System.out.print("Edad: ");
        int edad = new Scanner(System.in).nextInt();
        object.setEdad(edad);

        this.repositoryStructure.add((T) object);
    }

    public T findById(String id) {
        try {

            return this.repositoryStructure.findById(id);
        } catch (NullPointerException e) {

            return null;
        }
    }

    public void showAll() {
        this.repositoryStructure.showAll();
    }

    public T delete(String id) {
        try {

            return this.repositoryStructure.delete(id);
        } catch (NullPointerException e) {

            return null;
        }
    }
}
