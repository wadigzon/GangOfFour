package org.example;
// Non-terminal Expression - Subtraction
public class SubtractExpression implements Expression{
    private Expression left;
    private Expression right;

    public SubtractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Double interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}
