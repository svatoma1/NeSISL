package main.java.cz.cvut.ida.nesisl.api.data;

import main.java.cz.cvut.ida.nesisl.modules.tool.Tools;

/**
 * Created by EL on 7.3.2016.
 */
public class Value {

    public static String NAN_TOKEN = "NaN";

    private final Double value;

    public Value(Double value) {
        this.value = value;
    }

    public boolean isNaN() {
        return null == this.value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Value{" +
                "value=" + value +
                '}';
    }

    public static Value create(String value) {
        if (NAN_TOKEN.equals(value)) {
            return new Value(null);
        } else {
            return new Value(Double.valueOf(value));
        }
    }


    public boolean isOne() {
        return Tools.isZero(1.0-value);
    }

    public boolean isZero() {
        return Tools.isZero(value);
    }
}
