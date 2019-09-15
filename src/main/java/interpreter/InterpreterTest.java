package interpreter;

import java.util.HashMap;
import java.util.Map;

public class InterpreterTest {

    public static void main(String[] args) {
        String expression = "a b c - +";
        Evaluator evaluator = new Evaluator(expression);
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
