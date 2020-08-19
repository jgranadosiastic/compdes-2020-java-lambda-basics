package com.jgranados.streamsandlambdasbasics.lambdas.before;

/**
 * StreamsAndLambdasBasics
 * @author jose - 28.03.2020 
 * @Title: Mensajero
 * @Description: description
 *
 * Changes History
 */
public class MensajeroConComportamiento /*comportamiento de otros*/ {

    public void decirMensaje(Mensaje mensaje) {
        mensaje.ejecutar();
    }

    public static void main(String[] args) {

        MensajeroConComportamiento mensajero = new MensajeroConComportamiento();

        // este es el que tiene el comportamiento
        Mensaje mensajeHolaMundo = new MensajeHolaMundo();

        Mensaje mensajeHolaTodos = new MensajeHolaATodos();

        // solo recibe al dueño del comportamiento
        mensajero.decirMensaje(mensajeHolaMundo);
        mensajero.decirMensaje(mensajeHolaTodos);
    }
}