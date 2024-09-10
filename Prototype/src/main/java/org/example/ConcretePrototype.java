package org.example;
public class ConcretePrototype implements CloneablePrototype, Cloneable{
    private String name;
    private Integer age;
    public ConcretePrototype(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "{ [name]: " + name + ", [age]: " + age + " }";
    }
    @Override
    public ConcretePrototype clone() {
        try{
            return (ConcretePrototype) super.clone(); // shallow copy
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}