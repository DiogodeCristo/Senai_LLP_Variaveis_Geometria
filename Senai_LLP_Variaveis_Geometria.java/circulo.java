import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int raio;

        System.out.println("Digite o raio do seu circulo: ");
        raio = entrada.nextInt();

        System.out.printf("A area do seu circulo é: " + (raio*raio) * 3.14);

    }

}