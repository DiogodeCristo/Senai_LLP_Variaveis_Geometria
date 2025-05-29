import java.util.Scanner;
public class Algoritmo{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int base, altura;

        System.out.println("Digite a base do retangulo");
        base = entrada.nextInt();

        System.out.println("Digite a altura do retangulo");
        altura = entrada.nextInt();

        System.out.println("Sua area é: " + base*altura);
        


    }

}