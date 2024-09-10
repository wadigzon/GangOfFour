package org.example;

public class ProductExpression implements Expression{
    private Expression left;
    private Expression right;
    public ProductExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Double interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}
