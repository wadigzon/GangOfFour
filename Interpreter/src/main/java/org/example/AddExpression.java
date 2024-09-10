package org.example;
// Non-terminal Expression - Addition
public class AddExpression implements Expression{
    private Expression left;
    private Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Double interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
