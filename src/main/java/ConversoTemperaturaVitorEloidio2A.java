
import java.util.Scanner;


public class ConversoTemperaturaVitorEloidio2A {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(system.in);
    
        boolean continuar = true;
        
        whilw(continuar){
            System.out.println("===Converso de temperatura==");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("4. Sair");
            System.out.println("Escolha a unidade de oringem (1-4): ");
            int escolha = scanner.nextInt();
    
            if(escolha == 4){
                continuar=false;
                continue;
                
            }
            if (escolha<1 || escolha>4){
                System.out.println("Opcao invalida!"); 
                continue;
                
            }
            System.out.println("Digite o valor da temperatura: ");
            double graus = scaner.nextDouble();
            
            switch(escolha){
                case 1:
                    System.out.println("**********************");
                    System.out.println("'Resultado");
                    System.out.println("Fahrenheit: " +celsius.parafahrenheit());
                    System.out.println("Kelvin: "+celsius.paraKevin());
                    System.out.println("*******************");
                  
                    break;
                case 2:
                     Fahrenheit f = new Fahrenheit(graus); 
                    System.out.println("**********************");
                    System.out.println("'Resultado");
                    System.out.println("Celsius: " +f.paraCelsius());
                    System.out.println("Kelvin: "+f.paraKevin());
                    System.out.println("*******************");
                    
                    break;
                case 3:
                     Kelvin kelvin = new Kelvin(graus);
                    System.out.println("**********************");
                    System.out.println("'Resultado");
                    System.out.println("celsius: " +kelvin.paraCelsius());
                    System.out.println("Fahrenheit: "+kelvin.paraFahrenheit());
                    System.out.println("*******************");
            }
        }
                        
        scanner.close();    
            
            
            
    
    
    }




}
