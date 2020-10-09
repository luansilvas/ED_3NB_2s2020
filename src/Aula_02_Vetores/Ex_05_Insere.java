/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author luans
 */
public class Ex_05_Insere {

    public static void main(String[] args) {
        System.out.println("Quantas posições tem o seu vetor");
        int n = leInteiroPositivo();

        System.out.println("Qual número?");
        int x = leInteiroPositivo();

        System.out.println("Qual a posição?");
        int i = leInteiroPositivo();
        if (i < n) {

            int v[] = leVetorAleatorioEspaco(n);
            exibeVetor(v);
            System.out.println("\n");

            System.out.println("Esse é o seu novo vetor:");
            exibeVetor(insere(v, x, i));

        } else {
            System.out.println("Não existe essa posição no vetor");
        }

    }

    private static int[] insere(int[] v, int x, int i) {

        int aux = v[i];
        v[i] = x;
        
        int k = i;

        for (int j = v.length-2; j > i+1; j--) {
        v[j+1]=v[j];
        }
        
        v[i+1]=aux;
        return v;
    }

    public static int[] leVetorAleatorioEspaco(int n) {
        int v[] = new int[n + 1];

        for (int i = 0; i < v.length-1; i++) {
            v[i] = (int) (Math.random() * 100);
        }
        return v;
    }
}
