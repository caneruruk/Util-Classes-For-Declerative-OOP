package declerative.primitive.conversion;

import declerative.primitive.interfaces.PByte;
import declerative.primitive.interfaces.PString;

final public class PStringAsPByte implements PByte {
    public PStringAsPByte(final PString value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return Byte.parseByte(value.strValue());
    }

    private final PString value;
}
