package com.jgranados.streamsandlambdasbasics.streams;

/**
 * StreamsAndLambdasBasics
 * @author jose - 28.03.2020 
 * @Title: Transaccion
 * @Description: description
 *
 * Changes History
 */
public class Transaccion {

    private TipoTransaccion tipo;
    private String descripción;
    private double monto;

    public Transaccion(TipoTransaccion tipo,
            String descripción,
            double monto) {
        this.tipo = tipo;
        this.descripción = descripción;
        this.monto = monto;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public void imprimir() {
        System.out.printf("Tipo %s: \n", tipo);
        System.out.printf("Descripcion %s: \n", descripción);
        System.out.printf("Monto %f: \n", monto);
    }

}