import java.util.Scanner;

public class Algoritmo_005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int maior = 0;
        int menor = 0;
        int contador = 0;

        System.out.println("Digite números inteiros(digite 0 para encerrar): ");
        numero = entrada.nextInt();

        if (numero != 0) {
            maior = numero;
            menor = numero;
            contador = 1;
            while (numero != 0) {
                if (numero > maior) {
                    maior = numero;
                }

                numero = entrada.nextInt();

                contador = contador + 1;

            }

            System.out.println("Maior numero digitado: " + maior);
            System.out.println("Menor número digitado: " + menor);

        }

        else {
            System.out.println("Nenhum número foi digitado");
        }
        entrada.close();
    }

}
