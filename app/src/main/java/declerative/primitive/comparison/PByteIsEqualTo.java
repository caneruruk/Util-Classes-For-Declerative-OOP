package declerative.primitive.comparison;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PByte;

final public class PByteIsEqualTo implements PBoolean {
    public PByteIsEqualTo(final PByte left, final PByte right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return left.byteValue() == right.byteValue();
    }

    private final PByte left;
    private final PByte right;
}
