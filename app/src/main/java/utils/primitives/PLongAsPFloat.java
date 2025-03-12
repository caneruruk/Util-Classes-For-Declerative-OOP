package utils.primitives;

import utils.primitives.interfaces.PFloat;
import utils.primitives.interfaces.PLong;

final public class PLongAsPFloat implements PFloat {
    public PLongAsPFloat(final String value) {
        this(new PStringAsPLong(value));
    }

    public PLongAsPFloat(final long value) {
        this(new LongAsPLong(value));
    }

    public PLongAsPFloat(final int value) {
        this(new PIntegerAsPLong(value));
    }

    public PLongAsPFloat(final PLong value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.longValue();
    }

    private final PLong value;
}
