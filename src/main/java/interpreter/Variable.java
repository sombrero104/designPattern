package interpreter;

import java.util.Map;

/**
 * Terminal Expression
 */
public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        if(variables.get(name) != null) {
            return variables.get(name).interpret(variables);
        } else {
            return 0;
        }
    }

}
