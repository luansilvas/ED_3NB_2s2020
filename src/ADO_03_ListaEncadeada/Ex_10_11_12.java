
package ADO_03_ListaEncadeada;
/**
 *
 * @author luans
 */
public class Ex_10_11_12 {

    public static ListaEncadeada intercalar(ListaEncadeada A, ListaEncadeada B) {
        No tempA = A.ini, tempB = B.ini;
        ListaEncadeada C = new ListaEncadeada();
        while ((tempA != null) || (tempB != null)) { //Vou iterar até passar pelas duas listas

            if (tempA == null) {//supondo que a lista A esteja vazia, iremos inserir a lista C os valores de B diretamente
                C.insereFinal(tempB.getElemento());
                tempB = tempB.getProx();
            } else if (tempB == null) {//supondo que a lista B esteja vazia, iremos inserir a lista C os valores de A diretamente
                C.insereFinal(tempA.getElemento());
                tempA = tempA.getProx();
            } else if (tempA.getProx() == null && tempB.getProx() != null) {//se a lista A estiver no último elemento e B ainda não
                if (tempA.getElemento() <= tempB.getElemento()) { //se A for menor ou igual a B, é inserido no fim de C e será atribuído o valor nulo a variável tempA
                    C.insereFinal(tempA.getElemento());
                    tempA = tempA.getProx();
                } else { //se B for menor do que A, B será inserido no fim de C
                    C.insereFinal(tempB.getElemento());
                    tempB = tempB.getProx();
                }
            } else if (tempB.getProx() == null && tempA.getProx() != null) {//se a lista B estiver no último elemento e A ainda não
                if (tempB.getElemento() <= tempA.getElemento()) {//se B for menor do que A, ele será inserido no fim de C e será atribuído o valor nulo a variável tempB
                    C.insereFinal(tempB.getElemento());
                    tempB = tempB.getProx();
                } else { //Agora se A for menor que B, A será atribuído ao fim de C
                    C.insereFinal(tempA.getElemento());
                    tempA = tempA.getProx();
                }

            } else if (tempA.getElemento() <= tempB.getElemento()) { //Não estando nos casos de exceção, temos uma comparação simples, se o elemento do nó e maior ou menos pra ser incluído a lista
                C.insereFinal(tempA.getElemento());
                tempA = tempA.getProx();
            } else {
                C.insereFinal(tempB.getElemento());
                tempB = tempB.getProx();
            }

        }

        return C;

    }

    public static ListaEncadeada uniao(ListaEncadeada A, ListaEncadeada B) {
        ListaEncadeada C = A;//É atribuído ao vetor auxiliar todos os componenetes de A

        No tempB = B.ini;

        while (tempB != null) {
            No elementoB = C.buscaLinearIT2(tempB.getElemento());
            if (elementoB == null) { //se o valor não estiver na lista
                C.insereFinal(tempB.getElemento());
            }
            tempB = tempB.getProx();
        }

        return C;
    }

    public static ListaEncadeada interseccao(ListaEncadeada A, ListaEncadeada B) {
        ListaEncadeada C = new ListaEncadeada();
        No tempA = A.ini, tempB = B.ini;

        while (tempA != null && tempB != null) {

            No elementoA = B.buscaLinearIT2(tempA.getElemento()), elementoExistente = C.buscaLinearIT2(tempA.getElemento()); //estou verificando se o elemento de A existe na lista B e se ele também já existe em C
            if (elementoA != null&&elementoExistente==null) { //se existir em B também, porém ainda não existe em C, será incluído
                C.insereFinal(tempA.getElemento());
                B.removeOrdenado(elementoA.getElemento());

            }
            tempA = tempA.getProx();
        }
        return C;

    }

    
    
}
