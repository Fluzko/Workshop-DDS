package main.java;

public class Apagado implements Estado {
    @Override
    public void Apagar(Auto auto) {
        throw new YaApagadoException();
    }

    @Override
    public void Encender(Auto auto) {

    }

    @Override
    public void Acelerar(Auto auto,int Velocidad) {
        throw new ApagadoNoAceleraException();
    }

    @Override
    public boolean EstaEnReserva(Auto auto) {
        throw new ApagadoNoConsultaReserva();
    }
}
