import java.util.Scanner;

public class AreaCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento da caixa: ");
        double c = sc.nextDouble();

        System.out.print("Digite a largura da caixa: ");
        double l = sc.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        double h = sc.nextDouble();

        double area = 2 * (l*h + l*c + h*c);
        System.out.println("Área da superfície da caixa = " + area);

        sc.close();
    }
}
