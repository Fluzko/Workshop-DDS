package main.java;

public class ElectroVentilador {
    public void enfriar(Auto auto){
        auto.getMotor().AumentarTemperatura(-15,auto);
    }
}
