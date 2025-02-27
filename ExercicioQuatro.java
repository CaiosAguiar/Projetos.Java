import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Digite o primeiro número");
        float numero1 = 
        entrada.nextFloat();
      
        System.out.println("Digite o segundo número");
        float numero2 =
        entrada.nextFloat();


        if (numero1 > numero2) {
            System.out.println("A ordem crescente:" + numero1 + ", " + numero2 );
        }else{
            System.out.println("A ordem decrescente:" + numero2 + ", " + numero1);
        }

        entrada.close();






    }
    
}
