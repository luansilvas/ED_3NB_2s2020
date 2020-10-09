package ADO_01_Desempenho;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;

/**
 *
 * @author luans
 */
public class Ex_08 {

    /**
     *
     * 8) Escreva uma função que receba dois vetores (A[] e B[]), com n e m
     * elementos, respectivamente. Os vetores estão ordenados em ordem
     * crescente, a função aloca um vetor C[], exatamente com soma dos tamanhos
     * de A e B, e intercala os elementos de A[] e B[] em C[], de forma que o
     * vetor C[] fique em ordem crescente. A função deve ter deve ter
     * complexidade O(n+m), ou seja, a soma dos tamanho dos vetores.
     *
     *
     *
     */
    public static void main(String[] args) {
        int[] A = {1, 3, 7, 9, 11};
        int[] B = {2, 4, 5, 6, 8, 10};
        System.out.print("Esses são os vetores antes de intercalar:");

        System.out.print("\nA:");
        exibeVetor(A);
        System.out.print("\nB:");
        exibeVetor(B);

        int[] C = intercala(A, B);
        System.out.print("\nApós a intercalação:");
        exibeVetor(C);
    }

    public static int[] intercala(int A[], int B[]) {
        int[] C = new int[A.length + B.length];
        int indA = 0;
        int indB = 0;
        int indC = 0;
        while (indA < A.length && indB < B.length) {
            if (A[indA] < B[indB]) {
                C[indC] = A[indA];
                indA++;
            } else {
                C[indC] = B[indB];
                indB++;
            }
            indC++;
        }
        while (indA < A.length) { //verifica se ainda existe algum elemento no vetor A
            C[indC] = A[indA];
            indA++;
            indC++;
        }
        while (indB < B.length) { //verifica se ainda existe algum elemento no vetor B
            C[indC] = B[indB];
            indB++;
            indC++;
        }
        return C;
    }
}
