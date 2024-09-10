package org.example;
// Non-terminal Expression - Variable
public class VariableExpression implements Expression{
    private String variable;

    public VariableExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public Double interpret(Context context) {
        return context.getVariableValue(variable);
    }
}
