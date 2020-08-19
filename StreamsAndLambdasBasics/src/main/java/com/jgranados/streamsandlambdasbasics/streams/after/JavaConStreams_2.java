package com.jgranados.streamsandlambdasbasics.streams.after;

import com.jgranados.streamsandlambdasbasics.streams.TipoTransaccion;
import com.jgranados.streamsandlambdasbasics.streams.Transaccion;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * StreamsAndLambdasBasics
 *
 * @author jose - 28.03.2020
 * @Title: JavaConStreams
 * @Description: description
 *
 * Changes History
 */
public class JavaConStreams_2 {

    public static void main(String[] args) {
        List<Transaccion> transacciones = Stream.of(
                new Transaccion(TipoTransaccion.VENTA, "venta 1", 1000.0),
                new Transaccion(TipoTransaccion.VENTA, "venta 2", 4000.0),
                new Transaccion(TipoTransaccion.COMPRA, "compra 1", 20000.0),
                new Transaccion(TipoTransaccion.VENTA, "devolucion 1", 500.0)
        ).collect(Collectors.toList());

        // Obtener el total de ventas
        double totalVentas = transacciones
                .stream()
                .filter(transaccion -> TipoTransaccion.VENTA == transaccion.getTipo())
                .map(transaccion -> transaccion.getMonto())
                .reduce(0.0, (subtotal, monto) -> subtotal + monto);

        System.out.printf("Total ventas: %f\n", totalVentas);

        // Venta con mayor monto
        Optional<Transaccion> transaccionOpcional = transacciones
                .stream()
                .filter(transaccion -> TipoTransaccion.VENTA == transaccion.getTipo())
                .max((t1, t2) -> Double.compare(t1.getMonto(), t2.getMonto()));

        transaccionOpcional.ifPresent(transaction -> {
            System.out.println("Mayor venta:");
            transaction.imprimir();
        });
    }
}
