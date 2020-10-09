/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_ADO_02_Lista_Encadeada;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_06_ADO_02_Lista_Encadeada.Ex_12_b_Menor_Vetor.minVetorR;
import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_12_c_Soma {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = leInteiroPositivo();
     int v[] = leVetorAleatorio(n);
     exibeVetor(v);
     
        System.out.println("\nA soma dos elementos do vetor = " + somaVetorR(v));
    }
    /*
    public static int somaVetorR(int v[]){
        return somaVetorR(v, v.length);
    }
    
    public static int somaVetorR(int v[], int i){
        if( i == 1)
            return v[0];
        
        return v[i-1] + somaVetorR(v, i-1);
    }
    */
   public static int somaVetorR(int v[]){
        return somaVetorR(v,0);
    }
    
    public static int somaVetorR(int v[], int i){
        if( i == v.length -1)
            return v[i];
        
        return v[i] + somaVetorR(v, i+1);
    }
     
}
