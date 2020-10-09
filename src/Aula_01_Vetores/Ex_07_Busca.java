package Aula_01_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;

/* *
 * @author luans
 */
public class Ex_07_Busca {

    public static void main(String[] args) {
        int n = leInteiroPositivo();

        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("Digite o número que deseja buscar: ");
        int x = leInteiroPositivo();
        if (buscaLinear(v, x) != -1) {
            System.out.printf("O número %d foi encontrado no vetor na posicao %d!", x, buscaLinear(v, x));
        } else {
            System.out.printf("O número %d não foi encontrado no vetor!", x);
        }
    }

    public static int buscaLinear(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
