package interpreter;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements Expression {
    private Expression syntaxTree;

    public Evaluator(String expression) {
        Stack<Expression> expressionStack = new Stack<>();
        for(String token : expression.split(" ")) {
            if(("+").equals(token)) {
                Expression plus = new Plus(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(plus);
            } else if(("-").equals(token)) {
                Expression right = expressionStack.pop();
                Expression left = expressionStack.pop();
                Expression minus = new Minus(left, right);
                expressionStack.push(minus);
            } else {
                expressionStack.push(new Variable(token));
            }
        }
        syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return syntaxTree.interpret(variables);
    }

}
