package utils.primitives;

import utils.primitives.interfaces.PByte;
import utils.primitives.interfaces.PFloat;

final public class PByteAsPFloat implements PFloat {
    public PByteAsPFloat(final PByte value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return (float)value.byteValue();
    }

    private final PByte value;
}
