/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4.design.patterns;

/**
 *
 * @author Taha Shaik
 */

import org.Junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

@Test
public void testSingletonCreation() {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    assertEquals(s1, s2);
}

@Test
public void testSingletonNotNull() {
    Singleton s = Singleton.getInstance();
    assertNotNull(s);
}
}
