/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_01_Busca {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = leInteiroPositivo();
     int v[] = leVetorAleatorio(n);
     exibeVetor(v);
     
     System.out.println("\nDigite o número que deseja buscar: ");
     int x = sc.nextInt();
     
     if(busca(v,x)){
         System.out.printf("\n%d está no vetor", x);
     } else {
         System.out.printf("\n%d NÃO está no vetor", x);
     }
    }
    
    public static boolean busca(int[] v, int x){
        for (int i=0; i<v.length; i++){
            if (v[i] == x){
                return true; //achou
            }
        }
        return false; //não achou
    }
    
    
}
