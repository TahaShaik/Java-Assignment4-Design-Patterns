/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4.design.patterns;

/**
 *
 * @author dell
 */

// JUnit Test cases
import org.junit.Test;
import static org.junit.Assert.*;


public class FactoryTest {
    @Test
    public void testFactory() {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        assertNotNull(product);
        product.use();
    }
}
