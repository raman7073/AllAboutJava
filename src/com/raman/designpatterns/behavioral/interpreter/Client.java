package com.raman.designpatterns.behavioral.interpreter;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 12);
        context.put("c", 3);
        context.put("d", 120);

        AbstractExpression expression = new MultiplyNonTerminalExpression(
                new NumberTerminalExpression("a"), new NumberTerminalExpression("b")
        );
        System.out.println(expression.interpret(context));
        AbstractExpression expression1 = new SumNonTerminalExpression(expression,
                new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d")));
        System.out.println(expression1.interpret(context));
    }
}
/*
  interpreter vs composite
 */