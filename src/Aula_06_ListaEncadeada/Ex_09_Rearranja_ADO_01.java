/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Aula_04_Ex_ADO_01;
package Aula_06_ListaEncadeada;
import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
//import static Aula_03_Desempenho_Algoritmos.Ex_03_TrocaMaiorMenor.troca;
//import static Aula_04_Ex_ADO_01.Ex_06_exibeInters.bubbleSort;

/**
 *
 * @author anacris
 * 
 * 9) Escreva uma função que recebe um vetor como parâmetro, a sua função 
 * seleciona o primeiro elemento de um vetor e rearranja o vetor de forma 
 * que todos elementos menores ou iguais ao primeiro elemento fiquem a sua 
 * esquerda e os maiores a sua direita.
 * No vetor {5, 6, 2, 7, 9, 1, 8, 3, 7} após ser rearranjado teríamos 
* {1, 3, 2, 5, 9, 7, 8, 6, 7}. 
* A função deve rearranjar o vetor com a complexidade O(n).
* 
* 
 */
public class Ex_09_Rearranja_ADO_01 {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        //int A[] = leVetorAleatorio(n);
        //int A[] = {5,6,2,7,9,1};
        int A[]= {5,6,2,7,9,1,8,3,7};
        exibeVetor(A);
        
        rearranjaVetor2(A);
        System.out.println("\nOs elementos após o rearranjo:");
        exibeVetor(A);

    }

    public static void rearranjaVetor(int[] A) {
        int i = 0; //controla o pivô
        int j = 0;
        
        while (j < A.length){
            if (A[i] > A[j] && A[j] != A[i+1]) {
               // troca(A, i+1, j);
            //    troca(A, i, i+1);
                i++;
                j++;
                
            } else if (A[i] > A[j]) {
                 //troca(A, i, j);
                 i++;
                 j++; 
                 
            } else {
                j++;
            }
        }
        
       
    }
    //Solução do Paulo Honorato
    public static void rearranjaVetor2(int[] A) {
        int pivo = A[0]; 
        int i = 1;
        int j = A.length-1;
        
        while (i <= j){
            if (A[i] <= pivo) {
                i++;
            }
            else if (A[j] > pivo) {
                    j--; 
                 } else {
                    // troca(A,i,j);
                     i++;
                     j--;
                  }
        }
        //troca(A,0,j);
        
    }
}
