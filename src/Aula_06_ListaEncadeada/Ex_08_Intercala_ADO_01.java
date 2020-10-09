/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_ListaEncadeada;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
//import static Aula_04_Ex_ADO_01.Ex_06_exibeInters.bubbleSort;
//import static Aula_04_Ex_ADO_01.Ex_06_exibeInters.exibeInters;

/**
 *
 * @author anacris
 * 
 * Escreva uma função que receba dois vetores (A[] e B[]), com n e m elementos, 
 * respectivamente. Os vetores estão ordenados em ordem crescente, a 
 * função aloca um vetor C[], exatamente com soma dos tamanhos de A e B, 
 * e intercala os elementos de A[] e B[] em C[], de forma que o vetor C[] 
 * fique em ordem crescente. A função deve ter deve ter complexidade O(n+m), 
 * ou seja, a soma dos tamanho dos vetores.
 * 
 */
public class Ex_08_Intercala_ADO_01 {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int A[] = leVetorAleatorio(n);
        //bubbleSort(A);
        exibeVetor(A);
        
        int m = leInteiroPositivo();
        int B[] = leVetorAleatorio(m);
       // bubbleSort(B);
        exibeVetor(B);
        
        int C[] = intercala2Vetores(A,B);
        System.out.println("\nOs elementos da Intercalação são:");
        exibeVetor(C);

    }

    private static int[] intercala2Vetores(int[] A, int[] B) {
        int C[] = new int[A.length + B.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (k < C.length){
            //Sobras em B
            if (i == A.length) { //Já cai do vetor A se já rodou o A todo
                C[k] = B[j];
                j++;
                k++;
            } else // senao rodou A  todo
                //Sobras em A
                if (j == B.length) { //Já cai do vetor B
                  C[k] = A[i];
                  i++;
                  k++;
                }
                else if (A[i] <= B[j]){
                       C[k] = A[i];
                       i++;
                       k++;
                    } else {
                       C[k] = B[j];
                       j++;
                       k++;
                    }
        }
        return C;
    }
}
