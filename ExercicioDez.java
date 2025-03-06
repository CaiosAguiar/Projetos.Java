import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite primeiro números: ");
        int digiteUm = entrada.nextInt();

        System.out.println("Digite o segundo números: ");
        int digiteDois = entrada.nextInt();

        System.out.println("Digite o terceiro números: ");
        int digiteTres = entrada.nextInt();

    
        if (digiteUm == digiteDois && digiteDois == digiteTres ) {
            System.out.println("Os números são iguais");
            
        } else {
            int maiorNumero = Math.max(digiteUm, Math.max(digiteDois, digiteTres));
            System.out.println("O maior número é: " + maiorNumero);
            
        } 

        entrada.close();

    }
    
}
