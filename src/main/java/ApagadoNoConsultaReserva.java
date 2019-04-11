package main.java;

public class ApagadoNoConsultaReserva extends RuntimeException {

    public ApagadoNoConsultaReserva(){
        super("Con el auto apagado no se pude consultar la reesrva");
    }
}
