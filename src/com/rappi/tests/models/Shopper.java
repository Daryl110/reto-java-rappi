package com.rappi.tests.models;

public class Shopper extends Empleado {
    private String shopperId;
    private String tienda;

    public Shopper() {
        super();
    }

    public Shopper(
            String nombre,
            String apellido,
            String documentoIdentidad,
            int edad, String shopperId,
            String tienda
    ) {
        super(nombre, apellido, documentoIdentidad, edad);
        this.shopperId = shopperId;
        this.tienda = tienda;
    }

    public Shopper(String shopperId, String tienda) {
        this.shopperId = shopperId;
        this.tienda = tienda;
    }

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    @Override
    public String toString() {
        return "{ " + super.toString() +
                ", shopperId: \'" +
                this.shopperId +
                "\', tienda: \'" +
                this.tienda + "\' }";
    }
}
