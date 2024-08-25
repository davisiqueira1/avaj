import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class AvajSemanticAnalyzer extends AvajBaseListener {

    // Tabela de simbolos global
    private Map<String, String> globalSymbolTable = new HashMap<>();
    // Pilha de tabelas de simbolos para escopos locais
    private Stack<Map<String, String>> localSymbolTables = new Stack<>();

    @Override
    public void enterFunDecl(AvajParser.FunDeclContext ctx) {
        String funcName = ctx.ID().getText();
        if (globalSymbolTable.containsKey(funcName)) {
            error(ctx, "Funcao '" + funcName + "' ja foi declarada.");
        } else {
            globalSymbolTable.put(funcName, ctx.TYPE().getText());
        }

        // Criar uma nova tabela de simbolos para o escopo local (parametros da funcao)
        Map<String, String> functionScope = new HashMap<>();
        if (ctx.params() != null) {
            for (AvajParser.ParamContext param : ctx.params().param()) {
                String paramName = param.ID().getText();
                String paramType = param.TYPE().getText();
                if (functionScope.containsKey(paramName)) {
                    error(ctx, "Parametro '" + paramName + "' duplicado na funcao '" + funcName + "'.");
                } else {
                    functionScope.put(paramName, paramType);
                }
            }
        }
        localSymbolTables.push(functionScope);
    }

    @Override
    public void exitFunDecl(AvajParser.FunDeclContext ctx) {
        localSymbolTables.pop(); // Remover o escopo local da funcao
    }

    @Override
    public void enterVarDecl(AvajParser.VarDeclContext ctx) {
        String varName = ctx.ID().getText();
        Map<String, String> currentScope = localSymbolTables.isEmpty() ? globalSymbolTable : localSymbolTables.peek();

        if (currentScope.containsKey(varName)) {
            error(ctx, "Variavel '" + varName + "' ja foi declarada.");
        } else {
            currentScope.put(varName, ctx.TYPE().getText());
        }
    }

    @Override
    public void enterExpr(AvajParser.ExprContext ctx) {
        if (ctx.OP() != null || ctx.OPR() != null) {
            String leftType = getType(ctx.value(0));
            String rightType = getType(ctx.value(1));
            if (!leftType.equals(rightType)) {
                error(ctx, "Tipos incompativeis: '" + leftType + "' e '" + rightType + "'.");
            }
        }
    }

    @Override
    public void enterFunCall(AvajParser.FunCallContext ctx) {
        String funcName = ctx.ID().getText();
        if (!globalSymbolTable.containsKey(funcName)) {
            error(ctx, "Funcao '" + funcName + "' nao foi declarada.");
        } else {
            // Verificar tipos dos argumentos da funcao se necessario
        }
    }

    private boolean variableExists(String varName) {
        if (!localSymbolTables.isEmpty() && localSymbolTables.peek().containsKey(varName)) {
            return true;
        }
        return globalSymbolTable.containsKey(varName);
    }

    private String getType(AvajParser.ValueContext ctx) {
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            if (variableExists(varName)) {
                return lookupVariableType(varName);
            } else {
                error(ctx, "Variavel '" + varName + "' nao foi declarada.");
                return "";
            }
        } else if (ctx.NUM() != null) {
            return "tni";
        } else if (ctx.STRING() != null) {
            return "gnirts";
        } else if (ctx.funCall() != null) {
            return getFunctionReturnType(ctx.funCall());
        } else {
            return ""; // Suporta outros tipos
        }
    }

    private String getFunctionReturnType(AvajParser.FunCallContext ctx) {
        String funcName = ctx.ID().getText();
        if (globalSymbolTable.containsKey(funcName)) {
            return globalSymbolTable.get(funcName);
        } else {
            error(ctx, "Funcao '" + funcName + "' nao foi declarada.");
            return "";
        }
    }

    private String lookupVariableType(String varName) {
        if (!localSymbolTables.isEmpty() && localSymbolTables.peek().containsKey(varName)) {
            return localSymbolTables.peek().get(varName);
        }
        return globalSymbolTable.get(varName);
    }

    private void error(ParserRuleContext ctx, String message) {
        int line = ctx.start.getLine();
        int charPositionInLine = ctx.start.getCharPositionInLine();
        System.err.printf("Erro [linha %d:%d] %s%n", line, charPositionInLine, message);
    }

    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("exemplos.avaj");
        AvajLexer lexer = new AvajLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AvajParser parser = new AvajParser(tokens);
        ParseTree tree = parser.start();

        ParseTreeWalker walker = new ParseTreeWalker();
        AvajSemanticAnalyzer analyzer = new AvajSemanticAnalyzer();
        walker.walk(analyzer, tree);
    }
}
