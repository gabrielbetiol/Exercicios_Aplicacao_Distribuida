import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDois {

    public ExercicioDois() throws IOException {
        Scanner input = new Scanner(System.in);
        String opc = "";
        int i;
        int n;

        System.out.println("2) Escreva um programa Java que, dados N números informados pelo usuário, " +
                "informe qual o maior, qual o menor ou se todos são iguais. ");
        System.out.println("\nDigite a quantidade de numeros: ");
        n = input.nextInt();
        int numeros[] = new int[n];

        for (i=0; i<n; i++) {
            System.out.printf("Informe %2do. valor:  de %d: ", (i + 1), n);
            numeros[i] = input.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (i=0; i<n; i++) {
            if (numeros[i] > maior)
                maior = numeros[i];
            if (numeros[i] < menor)
                menor = numeros[i];
        }

        System.out.println("\n");
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);

        int primeiroNumero = numeros[0];
        boolean numerosIguais = true;

        for (i=0; i<n; i++) {
            if(!(numeros[i] == primeiroNumero)) {
                numerosIguais = false;
                break;
            }
        }
        if (numerosIguais) {
            System.out.println("Os numeros sao iguais!");
        }
        

    }
}
