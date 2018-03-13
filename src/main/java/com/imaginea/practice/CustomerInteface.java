package com.imaginea.practice;

/**
 * @author sudheerp
 * Used private methods in inteface to split the lengthy code of default methods
 */
public interface CustomerInteface {

    default void register(String name){
        System.out.println(encryptName(name));
    }

    private int encryptName(String name){
        return name.hashCode();
    }
}
