package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author luans
 */
public class Ex_08_Interseccao {
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetor(n1);
        exibeVetor(v1);
        int n2 = leInteiroPositivo();
        int v2[] = leVetor(n2);
        exibeVetor(v2);
        
        
        interseccao(v1,v2);
        
    }
    
        public static boolean busca(int[] v, int x) {
            boolean tem = false;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                tem = true;
            }
        }
        return tem;
    }

    private static void interseccao(int[] v1, int[] v2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
