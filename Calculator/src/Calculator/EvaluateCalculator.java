package Calculator;

import java.util.HashMap;
import java.util.Map;

import antlr.CalculatorBaseVisitor;
import antlr.CalculatorParser;

public class EvaluateCalculator extends CalculatorBaseVisitor<Integer> {

    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitAssignExpression(CalculatorParser.AssignExpressionContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expression());
        memory.put(id, value);
        return value;
    }

    @Override
    public Integer visitPrintExpression(CalculatorParser.PrintExpressionContext ctx) {
        Integer value = visit(ctx.expression());
        System.out.println(value);
        return value;
    }

    @Override
    public Integer visitInt(CalculatorParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitId(CalculatorParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0;
    }

    @Override
    public Integer visitMulDiv(CalculatorParser.MulDivContext ctx) {
        int left = visit(ctx.expression(0));
        int right = visit(ctx.expression(1));
        if (ctx.op.getType() == CalculatorParser.MUL) {
            return left * right;
        }
        return left / right;
    }

    @Override
    public Integer visitAddSub(CalculatorParser.AddSubContext ctx) {
        int left = visit(ctx.expression(0));
        int right = visit(ctx.expression(1));
        if (ctx.op.getType() == CalculatorParser.ADD) {
            return left + right;
        }
        return left - right;
    }

    @Override
    public Integer visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expression());
    }
}