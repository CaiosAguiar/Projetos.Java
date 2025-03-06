import java.util.Scanner;

public class ExercicioOito {
     
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha = "R10p5";

        System.out.println("Digite a senha correta: ");
        senha = entrada.nextLine();

        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido");
            
        } else {
            System.out.println("Acesso negado");
            
        } 

        entrada.close();

        
    }
    
}
