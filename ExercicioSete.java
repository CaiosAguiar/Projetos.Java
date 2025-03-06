import java.util.Scanner;

public class ExercicioSete {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tempoTrabalho;
        float salarioRecebido;

        System.out.println("Digite o seu tempo de empressa");
        tempoTrabalho = entrada.nextInt();
        
        System.out.println("Digite o seu salário");
        salarioRecebido = entrada.nextFloat();

        if (tempoTrabalho >= 5) {
            float bonus = (salarioRecebido * 20);
            System.out.println("Seu bonús é de de 20% " + bonus);
        
        } else if (tempoTrabalho < 5) {
            float bonus = (salarioRecebido * 10);
            System.out.println("Seu bonús é de 10% " + bonus);
            
        }

        entrada.close();


        
    }
    
}
