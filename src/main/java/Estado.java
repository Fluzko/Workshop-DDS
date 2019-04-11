package main.java;

public interface Estado {
    public void Encender(Auto auto);
    public void Apagar(Auto auto);
    public void Acelerar(Auto auto,int velocidad);
    public boolean EstaEnReserva(Auto auto);
}
