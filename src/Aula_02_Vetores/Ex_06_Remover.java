package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_07_Busca.buscaLinear;
import static Aula_02_Vetores.Ex_05_Insere.leVetorAleatorioEspaco;

/**
 *
 * @author luans
 */
public class Ex_06_Remover {

    public static void main(String[] args) {
        System.out.println("Quantas posições tem o seu vetor");
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("Qual número que você deseja remover?");
        int x = leInteiroPositivo();

        int pos = buscaLinear(v, x);
        if (pos != -1) {
            System.out.printf("O número %d foi encontrado no vetor na posicao %d", x, pos);
            System.out.println(remocao(v, pos));
            
        } else {
            System.out.printf("O número %d não foi encontrado no vetor!", x);
        }

    }

    private static int[] remocao(int[] v, int pos) {

        v[pos] = v[pos + 1];

        for (int j = v.length - 1; j > pos + 1; j--) {
            v[j - 1] = v[j];
        }
        v = new int[v.length - 1];

        return v;
    }

}
