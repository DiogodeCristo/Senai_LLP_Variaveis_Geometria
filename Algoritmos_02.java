import java.util.Scanner;
public class Algoritmos_02 {

    public static void main(String[] args) {
     int n1 , n2 , media;

     Scanner sc = new Scanner(System.in);
     int cont=0;
        System.out.println("Digite sua nota um: ");
           n1 = sc.nextInt();         
        while(n1<0 || n1>100)  {
            
            System.out.println("Nota inválida!!! Digite novamente: ");
           n1 = sc.nextInt(); 
        }

     
        System.out.println("Digite sua nota dois: ");
              n2 = sc.nextInt();
        while(n2<0 || n2>100){
            
           System.out.println("Nota inválida!!! Digite novamente: ");
            n2 = sc.nextInt();
        }
        

        media = (n1+n2)/2;

        System.out.println("Media é:" +media);






    }
}