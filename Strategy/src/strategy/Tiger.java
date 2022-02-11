/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author araju55
 */
public class Tiger extends Mammal {
    
    public Tiger(String name) {
        super(name);
        setDescription("a Predator");
        setAttack(new PounceAttack());
    }

    public void move() {
        System.out.println("stalks");
    }
}
