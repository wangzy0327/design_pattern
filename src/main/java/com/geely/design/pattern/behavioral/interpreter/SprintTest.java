package com.geely.design.pattern.behavioral.interpreter;


import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SprintTest {
    public static void main(String[] args) {
        org.springframework.expression.ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 + 66");
        int result = (int) expression.getValue();
        System.out.println(result);
    }
}
