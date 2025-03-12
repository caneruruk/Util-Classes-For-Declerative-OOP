package utils.primitives;

import utils.primitives.interfaces.PByte;
import utils.primitives.interfaces.PDouble;

final public class PByteAsPDouble implements PDouble {
    public PByteAsPDouble(final String value) {
        this(new PStringAsPByte(value));
    }

    public PByteAsPDouble(final PByte value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return (double)value.byteValue();
    }

    private final PByte value;
}
