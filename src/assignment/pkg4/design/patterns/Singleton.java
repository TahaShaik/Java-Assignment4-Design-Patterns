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

This class represents a singleton object that can only be instantiated once.

The getInstance() method returns the singleton instance, creating it if necessary.
*/
public class Singleton {
private static Singleton instance;

private Singleton() {
// Private constructor prevents instantiation from outside
}

public static synchronized Singleton getInstance() {
if (instance == null) {
instance = new Singleton();
}
return instance;
}

// Other methods here
}
