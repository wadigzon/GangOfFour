package org.example;

import java.util.HashMap;
import java.util.Map;

/*
15. **Interpreter Pattern:** Defines a grammar for the language of the interpreter and provides an interpreter that
interprets sentences in the language.
* */
public class Main {
    public static void main(String[] args) {
        // Define variables and values
        // Using HashMap in Java 8
        Map<String, Double> variableValues = new HashMap<>();
        variableValues.put("x", 5.0);
        variableValues.put("y", 10.0);
        variableValues.put("z", 2.0);

        Context context = new Context(variableValues);

        // Create expressions: z * (x + (20.0 - y)) / 15.0 = 2.0
        Expression expression = new DivisionExpression(
            new ProductExpression(
                new VariableExpression("z"),
                new AddExpression(
                new VariableExpression("x"),
                new SubtractExpression(
                    new NumberExpression(20.0),
                    new VariableExpression("y")
                ))
        ), new NumberExpression(15.0));

        // Interpret the expression
        Double result = expression.interpret(context);
        System.out.println("Result: " + result);
    }
}