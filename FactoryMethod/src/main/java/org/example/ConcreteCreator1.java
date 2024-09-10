package org.example;

public class ConcreteCreator1 implements Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
