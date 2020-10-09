/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_07_Inserção_Busca;

import Aula_06_ADO_02_Lista_Encadeada.*;
import Aula_06_ListaEncadeada.No;

/**
 *
 * @author anacris
 */
public class ListaEncadeada {

    No ini;

    //Cria uma lista encadeada vazia
    public ListaEncadeada() {
        this.ini = null;
    }

    public boolean vazia() {
        return ini == null;
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;

        while (temp != null) {
            strLista += temp.getElemento() + " ";
            temp = temp.getProx();
        }
        return strLista;
    }

    public No getIni() {
        return ini;
    }

    public void setIni(No ini) {
        this.ini = ini;
    }

    public void insereInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    public void insereFinal(int elemento) {
        No novo = new No(elemento, null);
        No temp = ini;

        if (temp == null) {//Lista vazia
            ini = novo;
        } else { //tem 1 ou mais nós
            while (temp.getProx() != null) {
                temp = temp.getProx();
            }
            temp.setProx(novo);
        }
    }

    public void insereFinalR(int elemento) {
        insereFinalR(ini, elemento);
    }

    public void insereFinalR(No temp, int elemento) {
        //Lista vazia
        if (temp == null) {
            No novo = new No(elemento, null);
            ini = novo;
        }
        //Estar no último nó
        if (temp.getProx() == null) {
            No novo = new No(elemento, null);
            temp.setProx(novo);
        } else {
            insereFinalR(temp.getProx(), elemento);
        }
    }

    public void insereOrdenado(int elemento) {
        No novo = new No(elemento, ini);
        No temp = ini;
        No anterior = null;

        while (temp != null && temp.getElemento() < novo.getElemento()) {
            anterior = temp;
            temp = temp.getProx();
        }
        //Lista vazia ou tem mais nós e insere no início
        if (anterior == null) {
            ini = novo;
        } else {
            //Lista tem 1 ou mais nós
            novo.setProx(temp);
            anterior.setProx(novo);
        }
    }

    public boolean buscaLinearIT(int x) {
        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == x) {
                return true; //achou
            }
            temp = temp.getProx();
        }
        return false; //Não achou
    }

    public boolean buscaLinearR(int x) {
        return buscaLinearR(ini, x);
    }

    public boolean buscaLinearR(No temp, int x) {
        if (temp == null) {
            return false; //nao achou
        }
        if (temp.getElemento() == x) {
            return true; //achou
        }
        return buscaLinearR(temp.getProx(), x);
    }

    public No buscaLinearIT2(int x) {
        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == x) {
                return temp; //achou
            }
            temp = temp.getProx();
        }
        return null; //Não achou
    }

    public No buscaLinearR2(int x) {
        return buscaLinearR2(ini, x);
    }

    public No buscaLinearR2(No temp, int x) {

        if (temp == null || temp.getElemento() == x) {
            return temp;
        }

        return buscaLinearR2(temp.getProx(), x);
    }

}
