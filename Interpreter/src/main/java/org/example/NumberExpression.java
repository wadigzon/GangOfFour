package org.example;
// Terminal Expression - Number
public class NumberExpression implements Expression{
    private Double number;

    public NumberExpression(Double number) {
        this.number = number;
    }
    @Override
    public Double interpret(Context context) {
        return number;
    }
}
