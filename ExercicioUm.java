import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[]args){

    Scanner digite = new Scanner(System.in);    
        
    int comparar = 20;

        System.out.println("Digite o número desejado");
        int numero = digite.nextInt();

        if (numero > 20) {
            double metade = numero / 2.0;
            System.out.println("O número digitado é maior que " + comparar + " e a metade do número comparado é:" + metade);
        }
    
        digite.close();

    }
    
}



    
   
