import java.util.Scanner;

public class Algoritmo_001 {
    public static void main(String[] args) {
        int n1, n2, n3;
        int maiorPar;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        n1 = leia.nextInt();

        System.out.println("Digite o segundo número:");
        n2 = leia.nextInt();

        System.out.println("Digite o terceiro número:");
        n3 = leia.nextInt();

        
        maiorPar = -1;

        
        if (n1 % 2 == 0) {
            maiorPar = n1;
        }

        
        if (n2 % 2 == 0) {
            if (maiorPar == -1 || n2 > maiorPar) {
                maiorPar = n2;
            }
        }

        
        if (n3 % 2 == 0) {
            if (maiorPar == -1 || n3 > maiorPar) {
                maiorPar = n3;
            }
        }

        
        if (maiorPar == -1) {
            System.out.println("Nenhum número par encontrado.");
        } else {
            System.out.println("O maior número par é: " + maiorPar);
        }

        
    }
}
