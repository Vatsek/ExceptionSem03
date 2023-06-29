package org.example;

public class NumberNotFoundException extends Exception{
    public NumberNotFoundException() {
        super("Числа с таким значением нет");
    }
}
