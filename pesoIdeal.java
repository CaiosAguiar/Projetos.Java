import java.util.Scanner;

public class pesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();
        
        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);
        
     
        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido! Use M para masculino ou F para feminino.");
            scanner.close();
            return;
        }

        System.out.printf("O peso ideal é: %.2f kg\n", pesoIdeal);
        
        scanner.close();
    }
}
