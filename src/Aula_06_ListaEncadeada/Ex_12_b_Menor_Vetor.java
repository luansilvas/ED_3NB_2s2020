/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_ADO_02_Lista_Encadeada;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_12_b_Menor_Vetor {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = leInteiroPositivo();
     int v[] = leVetorAleatorio(n);
     exibeVetor(v);
     
        System.out.println("\nO menor do vetor = " + minVetorR(v));
    }
    
    public static int minVetorR(int v[]){
        return minVetorR(v, v.length);
    }
    
    /*
    Se n = 1, v[0] é o único elemento e logo será o menor
    Se n > 1, o valor dque procuramos é o menor dentre o mínimo
    do v[n-1] e o v[0 .. n-2]. Assim, a instância v[0..n-1] fica reduzida a
    v[0 .. n-2]
    */
    public static int minVetorR(int v[], int i){
        if (i == 1)
            return v[0];
        
        int x = minVetorR(v, i-1);
        
        if (x < v[i-1])
            return x;
        
        return v[i-1];
            
    }
}
