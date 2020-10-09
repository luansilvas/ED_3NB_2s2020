package ADO_02_Recursividade;

/**
 *
 * @author Luan Silva dos Santos
 */
public class Ex_12 {

    public static void main(String[] args) {
        int[] vetorExemplo = {5, 2, 9, 7, 8};
        int procurado = 7;
        System.out.print("Buscamos o elemento " + procurado + " no vetor ");
        exibeVetor(vetorExemplo);
        int resultado = buscaLinear(vetorExemplo, procurado,0);
        if (resultado >= 0) {
            System.out.print(" E foi encontrado na posicao " + resultado + " \n\n");
        } else {
            System.out.print(". Porém ele não foi encontrado. \n\n");
        }

        System.out.print("O menor valor no vetor ");
        exibeVetor(vetorExemplo);
        int menor = vetorExemplo[0];
        System.out.print(" é o número " + MenorElemento(vetorExemplo,menor,1) + "\n\n");

        System.out.print("A soma dos elementos  no vetor ");
        exibeVetor(vetorExemplo);
        System.out.println(" será de " + somaElementos(vetorExemplo,0) + "\n\n");

        System.out.print("A media aritmética do vetor ");
        exibeVetor(vetorExemplo);
        System.out.print(" será " + mediaAritmetica(vetorExemplo, 0) + "\n\n");

    }

    public static int exibeVetor(int[] vetor) {
        return exibeVetor(vetor, 0);
    }

    public static int exibeVetor(int[] vetor, int indice) {
        if (indice==vetor.length) {
            return 0;
        }else{
            if (indice==0) {
                System.out.print("{");
            }
            System.out.print(vetor[indice]);
            if (indice<vetor.length-1) {
                System.out.print(", ");
                
            }
            if (indice==vetor.length-1) {
                System.out.print("}");
            }
        }
        
        return exibeVetor(vetor, indice + 1);
    }



    public static int buscaLinear(int vetor[], int num, int indice) {
        if (indice == vetor.length) {
            return -1;
        }
        if (vetor[indice] == num) {
            return indice;

        }
        return buscaLinear(vetor, num, indice + 1);
    }


    public static int MenorElemento(int vetor[], int menor, int indice) {
        if (indice == vetor.length) {
            return menor;
        } else {
            if (vetor[indice] < menor) {
                menor = vetor[indice];
            }
        }
        return MenorElemento(vetor, menor, indice + 1);
    }


    public static int somaElementos(int v[], int indice) {
        if (indice == v.length) {
            return 0;
        }
        return v[indice] + somaElementos(v, indice + 1);

    }

    public static float mediaAritmetica(int v[], int indice) {
        if (indice == v.length) {
            return 0;
        }

        float soma = v[indice] + mediaAritmetica(v, indice + 1);

        if (indice == 0) {
            return soma / v.length;
        }
        return soma;
    }

}
