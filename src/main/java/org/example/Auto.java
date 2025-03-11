package org.example;

public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private Double kilometraje;
    private String estado;
    private String placa;

    public Auto() {
    }

    public Auto(String marca, String modelo, int año, Double kilometraje, String estado, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", kilometraje=" + kilometraje +
                ", estado='" + estado + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }

    public void mostrarDetalles (){
        System.out.println("Detalles vehiculo");
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Año:" + año);
        System.out.println("Kilometraje:" + kilometraje);
        System.out.println("Estado:" + estado);
        System.out.println("Placa:" + placa);
    }
    public  void actualizarKilometraje (Double nuevoKilometraje){
         kilometraje = nuevoKilometraje;
    }
    public boolean esAntiguo ()
    {
       if (año < 15)
           return true;
       else
           return false;
    }
    public boolean necesitaMantenimiento()
    {
        if (kilometraje < 100.000)
            return true;
        else
            return false;
    }
    public double calcularConsumoCombustible(double distancia, double rendimiento){
        return distancia / rendimiento;
    }
    public double combustibleRestante(double capacidadTanque, double consumo){
        return capacidadTanque - consumo;
    }
}
