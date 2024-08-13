/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thread;

import java.util.ArrayList;

/**
 *
 * @author cg3029174
 */
public class Thread {

    public static void main(String[] args) {
        MegaSena[] m = new MegaSena[6];
                
        ArrayList<Integer> lista = new ArrayList<>();
        
        lista.add(3);
        lista.add(10);
        lista.add(38);
        lista.add(40);
        lista.add(48);
        lista.add(59);
        
        NumberGenerator g = new NumberGenerator(61);
        
        m[0] = new MegaSena("01", lista, g);
        m[1] = new MegaSena("02", lista, g);
        m[2] = new MegaSena("03", lista, g);
        m[3] = new MegaSena("04", lista, g);
        m[4] = new MegaSena("05", lista, g);    
        m[5] = new MegaSena("06", lista, g);
        
        m[0].start();
        m[1].start();
        m[2].start();
        m[3].start(); 
        m[4].start();   
        m[5].start();
     
        try {
            m[0].join();
            m[1].join();
            m[2].join();
            m[3].join();
            m[4].join();
            m[5].join();
        } catch (InterruptedException e) {
            System.exit(0);
        }
        
        System.out.println("\nResultado: ");
        System.out.println(m[0].getName() + ": " + m[0].getContador());
        System.out.println(m[1].getName() + ": " + m[1].getContador());
        System.out.println(m[2].getName() + ": " + m[2].getContador());
        System.out.println(m[3].getName() + ": " + m[3].getContador());
        System.out.println(m[4].getName() + ": " + m[4].getContador());
        System.out.println(m[5].getName() + ": " + m[5].getContador());
        System.out.println("Preco final: R$" + (m[0].getContador() + m[1].getContador() * m[2].getContador() * m[3].getContador() * m[4].getContador() * m[5].getContador()) * 5);
        
        
    }
}
