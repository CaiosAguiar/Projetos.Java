import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        int palpite;

        System.out.println("Digite o seu palpite"); 
        palpite = entrada.nextInt();

        if (palpite == 10) {
            System.out.println("O sue palpite está certo");       
        }else if(palpite < 10) {
            System.out.println("Seu palpite está errado");
        }
       
        entrada.close();


    }
}
