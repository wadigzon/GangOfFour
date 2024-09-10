package org.example;

public class ConcreteCreator2 implements Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
