package com.ex.prestamo.cliente.model;

import java.io.Serializable;

public class Prestamo implements Serializable{
    private String nombre;
    private double sueldo;
    private double valorPrestamo;
    private int numeroCuotas;
    private float interesAnual;

    public Prestamo(String nombre, double sueldo, double valorPrestamo, int numeroCuotas, float interesAnual) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.valorPrestamo = valorPrestamo;
        this.numeroCuotas = numeroCuotas;
        this.interesAnual = interesAnual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getValorPrestamo() {
        return valorPrestamo;
    }

    public void setValorPrestamo(double valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public float getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(float interesAnual) {
        this.interesAnual = interesAnual;
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prestamo{nombre=").append(nombre);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", valorPrestamo=").append(valorPrestamo);
        sb.append(", numeroCuotas=").append(numeroCuotas);
        sb.append(", interesAnual=").append(interesAnual);
        sb.append('}');
        return sb.toString();
    }
}
