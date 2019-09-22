package interpreter;

import java.util.Map;

/**
 * Abstract Expression
 */
public interface Expression {

    public int interpret(Map<String, Expression> variables);

}
