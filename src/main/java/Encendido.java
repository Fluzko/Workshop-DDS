package main.java;

public class Encendido implements Estado {
    @Override
    public void Apagar(Auto auto) {
        auto.cambiarEstado(new Apagado());
        auto.Enfriar();
    }

    @Override
    public void Encender(Auto auto) {
        throw new YaEncendidoException();
    }

    @Override
    public void Acelerar(Auto auto,int Velocidad) {
        auto.cambiarVelocidad(Velocidad);
        auto.aumentarTemperatura(0.2*Velocidad);
    }

    @Override
    public boolean EstaEnReserva(Auto auto) {
        return auto.tanque.EstaEnReserva();
    }
}
