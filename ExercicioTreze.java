import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");

      
        System.out.print("Digite o número da operação desejada: ");
        int opcao = scanner.nextInt();

        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;


        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado é: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado é: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("O resultado é: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("O resultado é: " + num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Opção inválida!");
                operacaoValida = false;
        }

       
        scanner.close();
    }
}
