package ADO_01_Desempenho;

/**
 *
 * @author luans
 */
import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;

public class Ex_09 {

    /**
     * *
     *
     * 9) Escreva uma função que recebe um vetor como parâmetro, a sua função
     * seleciona o primeiro elemento de um vetor e rearranja o vetor de forma
     * que todos elementos menores ou iguais ao primeiro elemento fiquem a sua
     * esquerda e os maiores a sua direita.
     *
     * No vetor {5, 6, 2, 7, 9, 1, 8, 3,7} após ser rearranjado teríamos {1, 3,
     * 2, 5, 9, 7, 8, 6, 7}. A função deve rearranjar o vetor com a complexidade
     * O(n).
     */

    public static void main(String[] args) {
        int[] vetor = {5, 6, 2, 7, 9, 1, 8, 3, 7};
        System.out.print("Esse é o vetor antes da organização:");
        exibeVetor(vetor);
        System.out.println("");
        System.out.print("\nEsse é o vetor a da organização:");

        exibeVetor(rearranja(vetor));
        System.out.println("");
    }

    public static int[] rearranja(int vetor[]) {
        int ref = vetor[0];
        int ini = 1;
        int fim = (vetor.length - 1);
        while (ini <= fim) {
            if (vetor[ini] <= ref) {
                ini++;
            } else if (vetor[fim] > ref) {
                fim--;

            } else {
                int t = vetor[ini];
                vetor[ini] = vetor[fim];
                vetor[fim] = t;
                ini++;
                fim--;

            }

        }
        vetor[0] = vetor[fim];
        vetor[fim] = ref;

        return vetor;

    }

}
