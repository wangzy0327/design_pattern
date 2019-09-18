package com.geely.design.pattern.behavioral.interpreter;

public class EmptyInterpreter implements Interpreter {



    @Override
    public int interpret() {
        return 0;
    }

    @Override
    public String toString() {
        return "空运算";
    }
}
