/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4.design.patterns;

/**
 *
 * @author Taha Shaik
 */

/**

This class provides a simple interface to a complex subsystem.

The client interacts only with this facade, which delegates to the subsystem.
*/
public class Facade {
private SubsystemA subA;
private SubsystemB subB;

public Facade() {
subA = new SubsystemA();
subB = new SubsystemB();
}

public void doSomething() {
subA.doSomething();
subB.doSomething();
}
}