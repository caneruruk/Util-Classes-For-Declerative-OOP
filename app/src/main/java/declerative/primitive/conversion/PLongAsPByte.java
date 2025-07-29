package declerative.primitive.conversion;

import declerative.primitive.interfaces.PByte;
import declerative.primitive.interfaces.PLong;

final public class PLongAsPByte implements PByte {
    public PLongAsPByte(final PLong value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return (byte)value.longValue();
    }

    private final PLong value;
}
