package org.example;

import java.util.Map;

public class Context {
    private Map<String, Double> variables;

    public Context(Map<String, Double> variables) {
        this.variables = variables;
    }

    public Double getVariableValue(String variable) {
        return variables.getOrDefault(variable, 0.0);
    }

    public void setVariableValue(String variable, Double value) {
        variables.put(variable, value);
    }
}
