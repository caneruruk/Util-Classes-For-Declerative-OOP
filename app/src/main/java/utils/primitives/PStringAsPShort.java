package utils.primitives;

import utils.primitives.interfaces.PShort;

final public class PStringAsPShort implements PShort {
    public PStringAsPShort(final String value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return Short.parseShort(value);
    }

    private final String value;
}
