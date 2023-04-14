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

This abstract class defines the interface for creating objects.
*/
public abstract class Factory {
public abstract Product createProduct();
}
/**

This concrete factory creates a specific type of product.
*/
public interface Product {
    void use();
}

public class ConcreteProduct implements Product {
    @Override
    public void use() {
        System.out.println("Using concrete product.");
    }
}

public interface Factory {
    Product createProduct();
}

public class ConcreteFactory implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}