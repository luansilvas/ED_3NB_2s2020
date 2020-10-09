/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO_03_ListaEncadeada;

import static ADO_03_ListaEncadeada.Ex_10_11_12.*;

/**
 *
 * @author luans
 */
public class TestaExercicio {

    public static void main(String[] args) {
        System.out.println("\nTestando a Intersecção");
        ListaEncadeada A = new ListaEncadeada();
        A.insereFinal(1);
        A.insereFinal(3);
        A.insereFinal(5);
        A.insereFinal(7);
        ListaEncadeada B = new ListaEncadeada();
        B.insereFinal(2);
        B.insereFinal(4);
        B.insereFinal(6);
        B.insereFinal(8);
        B.insereFinal(90);

        System.out.println("Lista A:");
        System.out.println(A.toString());
        System.out.println("Lista B:");
        System.out.println(B.toString());
        System.out.println("Aqui temos o resultado:");
        ListaEncadeada C = intercalar(A, B);
        System.out.println(C.toString());
        System.out.println("-----------------------------------------------------");
        System.out.println("\nTestando a União");
        ListaEncadeada D = new ListaEncadeada();
        D.insereFinal(0);
        D.insereFinal(1);
        D.insereFinal(2);
        D.insereFinal(5);
        D.insereFinal(7);
        D.insereFinal(8);
        D.insereFinal(15);
        ListaEncadeada E = new ListaEncadeada();
        E.insereFinal(2);
        E.insereFinal(3);
        E.insereFinal(5);
        D.insereFinal(6);
        E.insereFinal(8);
        E.insereFinal(10);
        E.insereFinal(15);
        System.out.println("Lista D:");
        System.out.println(D.toString());
        System.out.println("Lista E:");
        System.out.println(E.toString());
        System.out.println("Aqui temos o resultado:");
        ListaEncadeada F = uniao(D, E);
        System.out.println(F.toString());
        System.out.println("-----------------------------------------------------");
        System.out.println("\nTestando a Intersecção");
        ListaEncadeada G = new ListaEncadeada();
        G.insereFinal(1);
        G.insereFinal(1);
        G.insereFinal(9);
        G.insereFinal(10);
        G.insereFinal(80);
        G.insereFinal(5);
        G.insereFinal(1);
        ListaEncadeada H = new ListaEncadeada();
        H.insereFinal(5);
        H.insereFinal(6);
        H.insereFinal(7);
        H.insereFinal(8);
        H.insereFinal(9);
        H.insereFinal(1);
        System.out.println("Lista G:");
        System.out.println(G.toString());
        System.out.println("Lista H:");
        System.out.println(H.toString());
        ListaEncadeada I = interseccao(G, H);
        System.out.println("Aqui temos o resultado:");
        System.out.println(I.toString());

    }

}
