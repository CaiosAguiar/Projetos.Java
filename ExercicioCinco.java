import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        int horario;
        
        System.out.println("Digite o minuto de chegada");
        horario = entrada.nextInt();

        if (horario >= 50 && horario <= 100 ) {
            System.out.println("Pertence ao horario");  
        } else {
            System.out.println("Não pertence ao intervalo");
            
        }

        entrada.close();



        
    }
    
}
