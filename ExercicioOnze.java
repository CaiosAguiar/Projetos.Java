
import java.util.Scanner;

public class ExercicioOnze {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        
      //   infantilA = {5, 6, 7};
       ///  infantilB = {8, 9, 10};
      //   juvenilA = {11, 12, 13};
       //  juvenilB = {14, 15, 16, 17};
      //  senior = 18

      String categoria;

        if (idade >= 5 && idade <= 7) {
           categoria = "Infantil A";
            
        } else if (idade > 7 && idade <= 10 ) {
            categoria = "Infantil B";
            
        }else if (idade > 10 && idade <= 13) {
            categoria = "Infantil A";
            
        } else if (idade > 13 && idade <= 17) {
            categoria = "Infantil B";
        } else {
            categoria = "Sênior";
            
        }

        System.out.println("Categoria " + categoria);

      entrada.close();
      
    }


    
}