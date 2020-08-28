package com.rappi.tests.models;

public class RappiTendero extends Empleado {
  private String rappiTenderoId;
  private String nivel;
  private String ciudad;
  private String pais;

  public RappiTendero() {
    super();
  }

  public RappiTendero(
      String nombre,
      String apellido,
      String documentoIdentidad,
      int edad,
      String rappiTenderoId,
      String nivel,
      String ciudad,
      String pais
  ) {
    super(nombre, apellido, documentoIdentidad, edad);
    this.rappiTenderoId = rappiTenderoId;
    this.nivel = nivel;
    this.ciudad = ciudad;
    this.pais = pais;
  }

  public RappiTendero(String rappiTenderoId, String nivel, String ciudad, String pais) {
    this.rappiTenderoId = rappiTenderoId;
    this.nivel = nivel;
    this.ciudad = ciudad;
    this.pais = pais;
  }

  public String getRappiTenderoId() {
    return rappiTenderoId;
  }

  public void setRappiTenderoId(String rappiTenderoId) {
    this.rappiTenderoId = rappiTenderoId;
  }

  public String getNivel() {
    return nivel;
  }

  public void setNivel(String nivel) {
    this.nivel = nivel;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  @Override
  public String toString() {
    return "{ " + super.toString() +
        ", rappiTenderoId: \'" + rappiTenderoId +
        "\', nivel: \'" + nivel +
        "\', ciudad: \'" + ciudad +
        "\', pais: \'" + pais + "\' }";
  }
}
