import java.util.Scanner;
public class Algoritmo_003{
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("Digite números positivos (negativo para encerrar): ");

        numero = entrada.nextInt();
        while (numero >= 0 ) {
            contador++;
            numero = entrada.nextInt();

            
        }

        System.out.println("Quantidade de números positivos digitados: " + contador);

        entrada.close();


    
    
    
    
    
    
    
    
    
    
    
    }






}
