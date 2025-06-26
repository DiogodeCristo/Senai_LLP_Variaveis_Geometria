import java.util.Scanner;

public class AreaTubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do tubo: ");
        double r = sc.nextDouble();

        System.out.print("Digite a altura do tubo: ");
        double h = sc.nextDouble();

        double area = 2 * Math.PI * r * h + Math.PI * r * r;
        System.out.println("Área do tubo = " + area);

        sc.close();
    }
}
