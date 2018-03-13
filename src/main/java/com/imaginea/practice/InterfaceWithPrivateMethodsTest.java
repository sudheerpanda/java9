package com.imaginea.practice;

/**
 * @author sudheerp
 */
public class InterfaceWithPrivateMethodsTest implements CustomerInteface {
    public static void main(String[] args) {
        CustomerInteface c = new InterfaceWithPrivateMethodsTest();
        c.register("Test private methods");
    }
}
