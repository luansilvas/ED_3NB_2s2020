/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08_Remoção;

import Aula_07_Inserção_Busca.*;
import Aula_06_ListaEncadeada.*;
import Aula_06_ListaEncadeada.No;

/**
 *
 * @author anacris
 */
public class ListaEncadeada {
    No ini;
    
    //Cria uma lista encadeada vazia
    public ListaEncadeada(){
        this.ini = null;
    }
    
    public boolean vazia(){
        return ini == null;
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;
        
        while (temp != null){
            strLista += temp.getElemento() + " ";
            temp = temp.getProx();
        }
        return strLista;
    }
    
    public void insereInicio(int elemento){
        No novo = new No(elemento, ini);
        ini = novo;
    }
     public void insereFinal(int elemento){
        No novo = new No(elemento, null);
        No temp = ini;
        
        if (temp == null) {//Lista vazia
            ini = novo;
        }
        else  { //tem 1 ou mais nós
            while( temp.getProx() != null){
                temp = temp.getProx();
            }
            temp.setProx(novo);
        }
     }
     
     public void insereFinalR(int elemento){
         insereFinalR(ini, elemento);
     }
     
     public void insereFinalR(No temp, int elemento){
         //Lista vazia
         if (temp == null) {
            No novo = new No(elemento, null);
            ini = novo;
        }
        //Estar no último nó
        if( temp.getProx() == null){
            No novo = new No(elemento, null);
            temp.setProx(novo);
        } else {
            insereFinalR(temp.getProx(), elemento);
        }
     } 
     
     public void insereOrdenado(int elemento){
        No novo = new No(elemento, ini);
        No temp = ini;
        No anterior = null;
        
        while(temp != null && temp.getElemento() < novo.getElemento()){
            anterior = temp;
            temp = temp.getProx();
        }
        //Lista vazia ou tem mais nós e insere no início
        if(anterior == null){
            ini = novo;
        } else {
            //Lista tem 1 ou mais nós
            novo.setProx(temp);
            anterior.setProx(novo);
        }
     }
     
     public boolean buscaLinearIT(int x){
         No temp = ini;
         
         while (temp != null){
             if (temp.getElemento() == x){
                 return true; //achou
             }
             temp = temp.getProx();
         }
         return false; //Não achou
     }
     public boolean buscaLinearR(int x){
         return buscaLinearR(ini, x);
     }
     public boolean buscaLinearR(No temp, int x){
          if (temp == null)
             return false; //nao achou
          
         if (temp.getElemento() == x)
            return true; //achou
         
         return buscaLinearR(temp.getProx(),x);    
     }
     public No buscaLinearIT2(int x){
         No temp = ini;
         
         while (temp != null){
             if (temp.getElemento() == x){
                 return temp; //achou
             }
             temp = temp.getProx();
         }
         return null; //Não achou
     }
     public No buscaLinearR2(int x){
         return buscaLinearR2(ini, x);
     }
     public No buscaLinearR2(No temp, int x){
         
         if (temp == null || temp.getElemento() == x)
            return temp;
         
         return buscaLinearR2(temp.getProx(),x);    
     }
     public void removeInicio(){
         if (vazia()){
             System.out.println("Lista vazia!");
         }
         else {
             //A lista possui um ou mais nodes, remover o primeiro
             ini = ini.getProx();
         }
     }
       
     public void removeFinal(){
         if (vazia()){
             System.out.println("Lista vazia!");
             return;
         }
         No temp = ini;
         No anterior = null;
             
         while (temp.getProx() != null){
            anterior = temp;
            temp = temp.getProx();
         }
         //A lista com somente 1 node
         if(anterior == null){
                 ini = null; //A lista fica vazia
                 return;
          }
          //A lista possui dois ou mais nodes
          anterior.setProx(null);

     }
     
     public void removeFinalR(){
         removeFinalR(null, ini);
     }
     public void removeFinalR(No anterior, No temp){
        if (vazia()){
             System.out.println("Lista vazia!");
             return;
         }
        //A lista tem um único nó
         if(anterior == null && temp != null){
              ini = null; //A lista fica vazia
              return;
          }
         //Estou no último nó
         if(temp.getProx() == null){
             anterior.setProx(null);
             return;
         }
        removeFinalR(temp,temp.getProx());
     }
     
     public void removeFinal2(){
         if (vazia()){
             System.out.println("Lista vazia!");
             return;
         }
         No temp = ini;
         
         //A lista com somente 1 node
         if(temp.getProx() == null){
            ini = null; //A lista fica vazia
         }
         while (temp.getProx().getProx() != null){
            temp = temp.getProx();
         }
         //A lista possui dois ou mais nodes
         temp.setProx(null);
    }
    
    public void removeFinalR2(){
         removeFinalR2(ini);
     }
     public void removeFinalR2(No temp){
         if (vazia()){
             System.out.println("Lista vazia!");
             return;
         }
         //A lista com somente 1 node
         if(temp.getProx() == null){
            ini = null; //A lista fica vazia
            return;
         }
         //A lista possui dois ou mais nodes
         if(temp.getProx().getProx() == null){
            temp.setProx(null);
            return;
         }
         removeFinalR2(temp.getProx());
    }
     
   public void removeOrdenado(int elemento){
        if (vazia()){
             System.out.println("Lista vazia!");
             return;
         }
         No temp = ini;
         No anterior = null;
         
         while(temp != null && temp.getElemento() != elemento){
             anterior = temp;
             temp = temp.getProx();
         }
         //Remoção do início com 1 ou mais nós 
         if(anterior == null){
             ini = ini.getProx(); 
             return;
         }
         //Remoção entre 2 nós ou remoção no final
         if (temp != null && temp.getElemento() == elemento){
             anterior.setProx(temp.getProx());
             return;
         }
         System.out.println(elemento + " NÃO está na lista!");
         
   }
   public int contaNos(){
       int cont=0;
       No temp = ini;
       
       while (temp != null){
           temp = temp.getProx();
           cont++;
       }
       return cont; 
   }
   
   public int contaNos2(){
       int cont=0;
       
       for (No temp=ini; temp != null;temp = temp.getProx()){
           cont++;
       }
       return cont; 
   }
   public No menorNo(){
       No temp = ini;
       No menor = ini;
       
       while (temp != null){
           if(temp.getElemento() < menor.getElemento()){
               menor = temp;
           }
           temp = temp.getProx();
       }
       return menor;
   }
}
