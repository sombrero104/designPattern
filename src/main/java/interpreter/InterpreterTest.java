package interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Client
 */
public class InterpreterTest {

    public static void main(String[] args) {
        /**
         * 1. expression으로 Evaluator 객체 생성.
         *    -> Evaluator.java의 Evaluator() 생성자 설명 참조.
         */
        String expression = "a b c - +";
        Evaluator evaluator = new Evaluator(expression);

        /**
         * 2. 실제 값을 넣고 계산.
         *    -> Evaluator.java의 interpret() 메소드 설명 참조.
         */
        Map<String, Expression> variables = new HashMap<>();
        variables.put("a", new Number(5));
        variables.put("b", new Number(10));
        variables.put("c", new Number(42));
        int result = evaluator.interpret(variables);

        System.out.println("----------------------------------");
        System.out.println(expression);
        System.out.println("----------------------------------");
        System.out.println(((Number)variables.get("a")).getNumber() + " "
                + ((Number)variables.get("b")).getNumber() + " "
                + ((Number)variables.get("c")).getNumber() + " - +");
        System.out.println("----------------------------------");
        System.out.println("=> " + result);
        System.out.println("----------------------------------");
    }

}
