package interpreter;

import java.util.Map;

/**
 * Terminal Expression
 */
public class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return number;
    }

}
