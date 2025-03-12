package utils.primitives;

import utils.primitives.interfaces.PLong;

final public class PStringAsPLong implements PLong {
    public PStringAsPLong(final String value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return Long.parseLong(value);
    }

    private final String value;
}
