import java.util.Scanner;

public class Algoritmo_008 {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        int i, soma=1, n;


        System.out.println("Escreva qualquer número que seja calculável: ");
        n = leia.nextInt();

        for(i=1; i<=n; i=i+1){

            soma=soma*i;

        }
        System.out.println("Resultado = " + soma);
        








    }

}
