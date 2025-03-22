package declerative.primitive.arithmetic;

import declerative.primitive.interfaces.PByte;

final public class PByteSub implements PByte {
    public PByteSub(final PByte left, final PByte right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public byte byteValue() {
        return (byte)(left.byteValue() - right.byteValue());
    }

    private final PByte left;
    private final PByte right;
}
