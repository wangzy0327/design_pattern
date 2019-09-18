package com.geely.design.pattern.behavioral.interpreter;

public class OperatorUtil {

    private static final EmptyInterpreter EMPTY_INTERPRETER = new EmptyInterpreter();

    public static boolean isOperator(String symbol){
        return (symbol.equals("+")) || symbol.equals("-") ||
                (symbol.equals("*")) || symbol.equals("/");
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression,Interpreter secondExpression,String symbol){
        if(symbol.equals("+")){
            return new AddInterpreter(firstExpression,secondExpression);
        }else if(symbol.equals("-")){
            return new SubInterpreter(firstExpression,secondExpression);
        }else if(symbol.equals("*")){
            return new MultiInterpreter(firstExpression,secondExpression);
        }else if(symbol.equals("/")){
            return new DivInterpreter(firstExpression,secondExpression);
        }
        return EMPTY_INTERPRETER;
    }

}
