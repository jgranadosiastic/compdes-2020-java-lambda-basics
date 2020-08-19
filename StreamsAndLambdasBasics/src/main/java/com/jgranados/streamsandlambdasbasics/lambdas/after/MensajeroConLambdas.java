package com.jgranados.streamsandlambdasbasics.lambdas.after;

/**
 * StreamsAndLambdasBasics
 * @author jose - 28.03.2020 
 * @Title: MensajeroConLambdas
 * @Description: description
 *
 * Changes History
 */
public class MensajeroConLambdas {

    public void decirMensaje(ComportamientoMensaje comportamiento) {
        comportamiento.ejecutar();
    }

    public static void main(String[] args) {

        MensajeroConLambdas mensajero = new MensajeroConLambdas();

        ComportamientoMensaje comportamientoMensaje1 = (/*parametros */) -> System.out.println("Hola Mundo!!!");

        ComportamientoMensaje comportamientoMensaje2 = () -> {
            System.out.println("Hola Mundo!!!");
            System.out.println("Y Buenos dias");
        };

        mensajero.decirMensaje(comportamientoMensaje1);
        mensajero.decirMensaje(comportamientoMensaje2);

        mensajero.decirMensaje(() -> System.out.println("HOla a todos en JCONF!!!"));

        InterfazNumeros implementacion1 = (int x, int b) -> System.out.println("suma: " + (x + b));

    }
}