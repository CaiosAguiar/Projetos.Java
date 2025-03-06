import java.util.Scanner;

public class ExercicioDoze {

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double percentual1 = 20;
        double percentual2 = 25;
        double percentual3 = 30;

        System.out.println("Digite o seu salário");
        int salario = entrada.nextInt();

        if (salario <= 600 || salario <= 1200) {
            double desconto = (salario * (percentual1 / 100));
            System.out.println("O seu desconto do INSS é de: " + desconto);
        } else if (salario > 1200 || salario <= 2000) {
            double desconto = (salario * (percentual2 / 100));
            System.out.println("O seu desconto do INSS é de: " + desconto);
        } else if (salario > 2000) {
            double desconto = (salario * (percentual3 / 100));
            System.out.println("O seu desconto do INSS é de: " + desconto);
        }
        entrada.close();
    
    }



    
}
