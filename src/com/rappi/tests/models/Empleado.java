package com.rappi.tests.models;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private String documentoIdentidad;

    public Empleado() { }

    public Empleado(String nombre, String apellido, String documentoIdentidad, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    @Override
    public String toString() {
        return "nombre: \'" + nombre +
                "\', apellido: \'" + apellido +
                "\', edad: " + edad +
                ", documentoIdentidad: \'" + documentoIdentidad + "\'";
    }
}
