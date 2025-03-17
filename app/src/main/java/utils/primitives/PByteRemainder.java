package utils.primitives;

import utils.primitives.interfaces.PByte;

final public class PByteRemainder implements PByte {
    public PByteRemainder(final PByte left, final PByte right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public byte byteValue() {
        return (byte)(left.byteValue() % right.byteValue());
    }

    private final PByte left;
    private final PByte right;
}
