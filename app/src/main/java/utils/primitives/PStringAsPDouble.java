package utils.primitives;

import utils.primitives.interfaces.PDouble;

final public class PStringAsPDouble implements PDouble {
    public PStringAsPDouble(final String value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return Double.parseDouble(value);
    }

    private final String value;
}
