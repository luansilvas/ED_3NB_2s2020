/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_01_Vetores.Ex_04_Inverter.inverter;

/**
 *
 * @author luans
 */
public class Ex_02_Inverter {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        //int v[] = leVetor(n);
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        inverter(v);
        exibeVetor(v);
    }
}
