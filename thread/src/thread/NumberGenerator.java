/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

/**
 *
 * @author cg3029174
 */
public class NumberGenerator {
    private int multiplicador;
    
    public NumberGenerator(int multiplicador) {
        this.multiplicador = multiplicador;
    }
    
    
    public synchronized int getRandomNumber() {
        return (int)((Math.random() * this.multiplicador));
    }
}
