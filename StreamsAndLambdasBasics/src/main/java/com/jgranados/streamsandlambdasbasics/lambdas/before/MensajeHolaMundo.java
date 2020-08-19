package com.jgranados.streamsandlambdasbasics.lambdas.before;

/**
 * StreamsAndLambdasBasics
 * @author jose - 28.03.2020 
 * @Title: MensajeHolaMundo
 * @Description: description
 *
 * Changes History
 */
public class MensajeHolaMundo implements Mensaje {

    @Override
    public void ejecutar() {
        System.out.println("Hola Mundo!!");
    }


}