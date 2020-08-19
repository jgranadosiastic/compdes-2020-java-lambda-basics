package com.jgranados.streamsandlambdasbasics.lambdas.before;

/**
 * StreamsAndLambdasBasics
 * @author jose - 28.03.2020 
 * @Title: Mensajero
 * @Description: description
 *
 * Changes History
 */
public class Mensajero {

    public void decirMensaje() {
        System.out.println("Hola Mundo!!");
        // mas lineas
    }

    public static void main(String[] args) {

        Mensajero mensajero = new Mensajero();
        mensajero.decirMensaje();
    }
}