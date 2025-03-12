package utils.primitives;

import utils.primitives.interfaces.PByte;

final public class PByteAdd implements PByte {
    public PByteAdd(final int left, final String right) {
        this(new IntegerAsPByte(left), new PStringAsPByte(right));
    }

    public PByteAdd(final String left, final int right) {
        this(new PStringAsPByte(left), new IntegerAsPByte(right));
    }

    public PByteAdd(final String left, final String right) {
        this(new PStringAsPByte(left), new PStringAsPByte(right));
    }

    public PByteAdd(final String left, final PByte right) {
        this(new PStringAsPByte(left), right);
    }

    public PByteAdd(final PByte left, final String right) {
        this(left, new PStringAsPByte(right));
    }

    public PByteAdd(final int left, final int right) {
        this(new IntegerAsPByte(left), new IntegerAsPByte(right));
    }

    public PByteAdd(final int left, final PByte right) {
        this(new IntegerAsPByte(left), right);
    }

    public PByteAdd(final PByte left, final int right) {
        this(left, new IntegerAsPByte(right));
    }

    public PByteAdd(final PByte left, final PByte right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public byte byteValue() {
        return (byte)(left.byteValue() + right.byteValue());
    }

    private final PByte left;
    private final PByte right;
}
