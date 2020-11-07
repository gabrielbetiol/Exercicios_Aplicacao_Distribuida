import java.util.Scanner;

public class ExercicioUm {



    public ExercicioUm() {
        Scanner input = new Scanner(System.in);

        int n = 3;
        int numeros[] = new int[n];
        int i;

        System.out.println("1) Escreva um programa Java que, dados três números informados pelo usuário, " +
                "informe qual o maior, qual o menor ou se os três são iguais. ");

        for (i = 0; i < n; i++) {
            System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
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
        if ((numeros[0] == numeros[1] ) && (numeros[0]== numeros[2]) && (numeros[1] == numeros[2])) {
            System.out.println("Os numeros sao iguais!");
        }
    }
}
