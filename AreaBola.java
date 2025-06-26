import java.util.Scanner;

public class AreaBola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da bola: ");
        double r = sc.nextDouble();

        double area = 4 * Math.PI * r * r;
        System.out.println("Área da bola = " + area);

        sc.close();
    }
}
