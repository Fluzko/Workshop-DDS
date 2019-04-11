package main.java;

//dds-utnfrba-17/granviaje

public class Auto {

    private Estado estado;
    private ElectroVentilador electro;
    public Tanque tanque;
    private Motor motor;
    private int Velocidad;
    private int temperaturaQueAumentaAlArrancar = 70;
    private double combustible;
    private double porcentajeCombustibleQueConsumeAlArrancar = combustible * 0.001;

    public void Encender(){
        this.estado.Encender(this);
        this.aumentarTemperatura(temperaturaQueAumentaAlArrancar);
        this.consumirCombustible(porcentajeCombustibleQueConsumeAlArrancar);
        this.chequearReserva();
    }
    public void Apagar(){
        this.estado.Apagar(this);
    }

    public void cambiarEstado(Estado NuevoEstado){
        this.estado = NuevoEstado;
    }

    public void Acelerar(int Velocidad){
        estado.Acelerar(this,Velocidad);
    }

    public void cambiarVelocidad(int NuevaVelocidad){
        this.Velocidad = NuevaVelocidad;
    }

    public void Enfriar(){
        electro.enfriar(this);
    }

    public void chequearReserva(){

    }

    public void detenerse(){
        this.aumentarTemperatura(0.04 * this.Velocidad);
        this.cambiarVelocidad(0);

    }

    public boolean EstaEnReserva(){
        return this.estado.EstaEnReserva(this);
    }

    public void aumentarTemperatura(double TemperaturaAumento){
        motor.AumentarTemperatura(TemperaturaAumento,this);
    }
    private void consumirCombustible(double Consumido){
        combustible -= Consumido;
    }

    public Motor getMotor() {
        return motor;
    }
}
