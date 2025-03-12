package utils.primitives;

import utils.primitives.interfaces.PByte;
import utils.primitives.interfaces.PString;

final public class PStringAsPByte implements PByte {
    public PStringAsPByte(final String value) {
        this(new StringAsPString(value));
    }

    public PStringAsPByte(final PString value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return Byte.parseByte(value.strValue());
    }

    private final PString value;
}
