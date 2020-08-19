package com.jgranados.streamsandlambdasbasics.lambdas.after;

import com.jgranados.streamsandlambdasbasics.lambdas.before.Mensaje;

/**
 * StreamsAndLambdasBasics
 * @author jose - 28.03.2020 
 * @Title: MensajeBuenosDias
 * @Description: description
 *
 * Changes History
 */
public class MensajeBuenosDias implements Mensaje {

    @Override
    public void ejecutar() {
        System.out.println("Buenos dias!!");
    }

}