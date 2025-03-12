package utils.primitives;

import utils.primitives.interfaces.PFloat;

final public class PStringAsPFloat implements PFloat {
    public PStringAsPFloat(final String value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return Float.parseFloat(value);
    }

    private final String value;
}
