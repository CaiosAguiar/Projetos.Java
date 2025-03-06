import java.util.Scanner;

public class ExercicioNoveJava {

   public static void main(String[]args){
      Scanner entrada = new Scanner(System.in);

      System.out.println("Digite valor do seu salário bruto: ");
      int salarioBruto = entrada.nextInt();
    
      System.out.println("Digite valor do seu salário bruto: ");
      double valorPrestacao = entrada.nextDouble();

      double limite = salarioBruto * 0.30;
    
      if (valorPrestacao < limite ) {
        System.out.println("Emprestimo concedido");
         
      } else if (valorPrestacao >= limite){
         System.out.println("Emprestimo não concedido");
         
      }
      entrada.close();
   }
    
}
