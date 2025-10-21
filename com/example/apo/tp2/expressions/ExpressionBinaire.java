package com.example.apo.tp2.expressions;

public abstract class ExpressionBinaire implements Expression {
    protected final Expression expression1;
    protected final Expression expression2;

    public ExpressionBinaire(Expression e1, Expression e2) {
        this.expression1 = e1;
        this.expression2 = e2;
    }
}
