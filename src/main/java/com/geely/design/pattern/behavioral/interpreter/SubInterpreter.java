package com.geely.design.pattern.behavioral.interpreter;

public class SubInterpreter implements Interpreter{

    private Interpreter firstExpression,secondExpression;

    public SubInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() - this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "-";
    }
}
