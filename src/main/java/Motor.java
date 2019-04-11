package main.java;

public class Motor  {
    private double temperatura;
    private Temperatura  Estado = new Normal();

    public void AumentarTemperatura(double Aumento,Auto auto){
        this.temperatura += Aumento;
        this.enfriarSiEsNecesario(auto);
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void Enfriar(){
        temperatura = 0;
    }

    public boolean EstaCaliente(){
        return temperatura >= 95;

    }
    public void ChequearEstado(){
        if(this.EstaCaliente()){
            Estado = new Caliente();
        }else{
            Estado = new Normal();
        }
    }

    public void enfriarSiEsNecesario(Auto auto){
        this.ChequearEstado();
        this.Estado.Efecto(auto);
    }
}
