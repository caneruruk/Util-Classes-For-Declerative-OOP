package utils.primitives;

import utils.primitives.interfaces.PInteger;

final public class PStringAsPInteger implements PInteger {
    public PStringAsPInteger(final String value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return Integer.parseInt(value);
    }

    private final String value;
}
