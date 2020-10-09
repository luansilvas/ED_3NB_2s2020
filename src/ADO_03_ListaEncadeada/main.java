/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO_03_ListaEncadeada;

import static ADO_03_ListaEncadeada.Ex_10_11_12.interseccao;

/**
 *
 * @author luans
 */
public class main {

    public static void main(String[] args) {
        ListaEncadeada y = new ListaEncadeada();
        y.insereInicio(1);
        y.insereFinal(1);
        y.insereFinal(9);
        y.insereFinal(10);
        y.insereFinal(80);
        y.insereFinal(5);
        y.insereFinal(1);
        ListaEncadeada x = new ListaEncadeada();
        x.insereInicio(2);
        x.insereFinal(6);
        x.insereFinal(7);
        x.insereFinal(8);
        x.insereFinal(9);
        x.insereFinal(1);
        System.out.println("Lista G:");
        System.out.println(y.toString());
        System.out.println("Lista H:");
        System.out.println(x.toString());
        ListaEncadeada z = interseccao(y, x);
        System.out.println("Aqui temos o resultado:");
        System.out.println(z.toString());
        System.out.println(z.vazia());

    }
}
