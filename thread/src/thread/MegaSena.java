/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import java.util.ArrayList;

/**
 *
 * @author cg3029174
 */
public class MegaSena extends java.lang.Thread{
    private int contador = 1;
    private ArrayList<Integer> lista;
    private NumberGenerator g;
    
    public MegaSena(String nome, ArrayList<Integer> lista, NumberGenerator g){
        super(nome);
        this.lista = lista;
        this.g = g;
    }
    
    @Override
    public void run() {
        boolean x = true;
        int y = 0;
        while (x) {
            System.out.println("Estou rodando: " + getName());
            y = g.getRandomNumber();
               if (lista.contains(y)) {
                  x = false;
                  lista.remove(Integer.valueOf(y));
               }
             contador++;
           
        }
    }


    public int getContador() {
        return contador;
    }
    
    
}
