package org.example;

public class DivisionExpression implements Expression{
    private Expression left;
    private Expression right;
    public DivisionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public Double interpret(Context context) {
        return left.interpret(context)/right.interpret(context);
    }
}
