import java.util.Scanner;
public class Algoritmo_004{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite números positivos (negativos para encerrar): ");
        numero = entrada.nextInt();
        while (numero>=0){
            soma = soma + numero;
            contador++;
            numero = entrada.nextInt();           

        }

        if (contador > 0){
            double media = (double) soma / contador;
            System.out.println("Média dos números digitados:" + media);

        } else {
            System.out.println("Nenhum número positivo foi digitado.");

        }

        entrada.close();







    }

}
