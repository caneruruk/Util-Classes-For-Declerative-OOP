package declerative.primitive.bitwise;

import declerative.primitive.interfaces.PByte;

final public class PByteXor implements PByte {
    public PByteXor(final PByte left, final PByte right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public byte byteValue() {
        return (byte)(left.byteValue() ^ right.byteValue());
    }

    private final PByte left;
    private final PByte right;
}
