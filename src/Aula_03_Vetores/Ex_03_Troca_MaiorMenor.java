/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author luans
 */
public class Ex_03_Troca_MaiorMenor {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        
        System.out.println("Esse é o novo vetor:");
        exibeVetor(trocaMaiorMenor(v));

    }

    public static int[] trocaMaiorMenor(int v[]) {
        int posMaior = 0;
        int posMenor = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > v[posMaior]) {
                posMaior = i;
            }
            if (v[i] < v[posMenor]) {
                posMenor = i;
            }

        }
        int aux = v[posMenor];
        v[posMenor]=v[posMaior];
        v[posMaior]=aux;
        return v;
    }

}
