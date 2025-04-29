//
public class Fahrenheit extends Temperatura{
    //CONTRUTOR
    public Fahrenheit(double valorGraus) {
        //SUPER SE REFERE A CLASSE PAI
        super(valorGraus);
    }
    //METODO QUE CONVERTE FAHRENHEIT PARA CELSIUS
    public double paraCelsius(){
        return (getGraus()-32)*5/9;
    }
    //METODO QUE CONVERTE FAHRENHEIT PARA KELVIN
    public double paraKelvin(){
        return (getGraus()+273);
    }

    String paraKevin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
