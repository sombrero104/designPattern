package interpreter;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements Expression {
    private Expression syntaxTree;

    /**
     * 1. expression으로 Evaluator 객체 생성.
     *
     * a b c - +
     * 위와 같은 expression이 들어왔을 때, 스택의 변화 순서.
     *
     * (1) a, b, c가 차례대로 스택에 쌓임.
     * --------------------------------------------------
     * Variable(c)
     * Variable(b)
     * Variable(a)
     * --------------------------------------------------
     *
     * (2) b와 c가 pop되어 Minus로 쌓임.
     * --------------------------------------------------
     * Minus(Variable(b), Variable(c))
     * Variable(a)
     * --------------------------------------------------
     *
     * (3) 최종적으로 syntaxTree에 저장되는 형태.
     * --------------------------------------------------
     * Plus(Minus(Variable(b), Variable(c)), Variable(a))
     * --------------------------------------------------
     *
     */
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

    /**
     * 2. 실제 값을 넣고 계산.
     *
     * ----------------
     * "a", Number(5)
     * "b", Number(10)
     * "c", Number(42)
     * ----------------
     * 위와 같은 variables 맵이 들어왔을 때,
     *
     * (1) syntaxTree에 저장된 아래 형태에서
     *     겉에서부터 차례대로 variables값을 넘기면서 interpret()을 호출한다.
     * --------------------------------------------------
     * Plus(Minus(Variable(b), Variable(c)), Variable(a))
     * --------------------------------------------------
     *
     */
    @Override
    public int interpret(Map<String, Expression> variables) {
        return syntaxTree.interpret(variables);
    }

}
