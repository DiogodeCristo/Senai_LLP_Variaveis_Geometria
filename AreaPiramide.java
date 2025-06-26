import java.util.Scanner;

public class AreaPiramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento da base (quadrada): ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura lateral da pirâmide: ");
        double alturaLateral = sc.nextDouble();

        double area = (base * base) + 2 * base * alturaLateral;
        System.out.println("Área da pirâmide = " + area);

        sc.close();
    }
}
