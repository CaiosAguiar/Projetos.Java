import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[]args){

        Scanner digite = new Scanner(System.in);

        int comparar = 18;

        System.out.println("Digite sua idade");
        int idade = digite.nextInt();

        if (idade > 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
            
        }

        digite.close();


        
        
    
        
    }
    
}
