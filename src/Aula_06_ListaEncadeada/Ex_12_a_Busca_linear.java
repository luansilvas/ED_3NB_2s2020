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
public class Ex_12_a_Busca_linear {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = leInteiroPositivo();
     int v[] = leVetorAleatorio(n);
     exibeVetor(v);
     
     System.out.println("\nDigite o número que deseja buscar: ");
     int x = sc.nextInt();
     
     if(buscaLinearR(v,x) != -1){
         System.out.printf("\n%d está no vetor", x);
     } else {
         System.out.printf("\n%d NÃO está no vetor", x);
     }
    }
    
    public static boolean buscaLinear(int[] v, int x){
        for (int i=0; i<v.length; i++){
            if (v[i] == x){
                return true; //achou
            }
        }
        return false; //não achou
    }
    /*
    Se n = 0, o vetor está vazio e x não está em v[0 ... n-1]
    Se n > 0, x está em v[0 .. n-1] se, e somente se, x = v[n-1] 
    ou x está no v[0 ..n-2]
    
    public static int buscaLinearR(int[] v, int x){
        return buscaLinearR(v, x, v.length);
    }
    
    public static int buscaLinearR(int[] v, int x, int i){
        if (i == 0)
            return -1;
        
        if (x == v[i-1])
            return i-1;
        
        return buscaLinearR(v, x, i-1);
    }
    */
    
    public static int buscaLinearR(int[] v, int x){
        return buscaLinearR(v, x, 0);
    }
    
    public static int buscaLinearR(int[] v, int x, int i){
        if (i == v.length)
            return -1;
        
        if (x == v[i])
            return i;
        
        return buscaLinearR(v, x, i+1);
    }
    
}
