//CLASSE FILHA
public class Celsius extends Temperatura{
    public Celsius(double valorGraus){
        //O SUPER SE REFERE A CLASSE PAI
        super(valorGraus);
    }
    //CRIANDO OS METODOS PARA CONVERTE 
    public double paraFahrenheit(){
        return (getGraus()*9/5)+32;
    }
    //CRIANDO UM METODO DE CELSIUS PARA KELVIN
    public double paraKelvin(){
        return getGraus()+273;
    }





}


