package main.java;

public class ApagadoNoAceleraException extends RuntimeException {

    public ApagadoNoAceleraException(){
        super("No se puede acelerar si esta apagado");
    }
}