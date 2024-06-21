package com.raman.designpatterns.behavioral.interpreter;

public class SumNonTerminalExpression implements AbstractExpression {
    AbstractExpression left;
    AbstractExpression right;

    public SumNonTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
