package com.ex.prestamo.model;

import java.io.Serializable;

/**
 * Se crea en un paquete de modelo aparte por temas de la serializacion
 * cuando se envia al servidor, ya que las clases deben tener exactamente
 * la misma ruta de paquete y nombre de clase
 * @author EX
 */
public class EstudioPrestamo implements Serializable{
    private static final long serialVersionUID = 654987321654987322L;
    
    private Prestamo prestamo;
    private double valorCuota;
    private double valorInteresMensual;
    private double totalPagar;

    public EstudioPrestamo(Prestamo prestamo, double valorCuota, double valorInteresMensual, double totalPagar) {
        this.prestamo = prestamo;
        this.valorCuota = valorCuota;
        this.valorInteresMensual = valorInteresMensual;
        this.totalPagar = totalPagar;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }

    public double getValorInteresMensual() {
        return valorInteresMensual;
    }

    public void setValorInteresMensual(double valorInteresMensual) {
        this.valorInteresMensual = valorInteresMensual;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EstudioPrestamo{prestamo=").append(prestamo);
        sb.append(", valorCuota=").append(valorCuota);
        sb.append(", valorInteresMensual=").append(valorInteresMensual);
        sb.append(", totalPagar=").append(totalPagar);
        sb.append('}');
        return sb.toString();
    }
}
