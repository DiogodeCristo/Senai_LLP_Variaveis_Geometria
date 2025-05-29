import java.util.Scanner;
public class triangulo{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int altura, base;

        System.out.println("Digite a altura do triangulo: ");
        altura = entrada.nextInt();

        System.out.println("Digite a base do triangulo: ");
        base = entrada.nextInt();

        System.out.println("A area do seu triangulo é: " + (altura*base)/2);

        


    }

}