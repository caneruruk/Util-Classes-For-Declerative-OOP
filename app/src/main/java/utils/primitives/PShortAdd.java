package utils.primitives;

import utils.primitives.interfaces.PShort;

final public class PShortAdd implements PShort {
    public PShortAdd(final int left, final String right) {
        this(new IntegerAsPShort(left), new PStringAsPShort(right));
    }

    public PShortAdd(final String left, final int right) {
        this(new PStringAsPShort(left), new IntegerAsPShort(right));
    }

    public PShortAdd(final String left, final String right) {
        this(new PStringAsPShort(left), new PStringAsPShort(right));
    }

    public PShortAdd(final String left, final PShort right) {
        this(new PStringAsPShort(left), right);
    }

    public PShortAdd(final PShort left, final String right) {
        this(left, new PStringAsPShort(right));
    }

    public PShortAdd(final int left, final int right) {
        this(new IntegerAsPShort(left), new IntegerAsPShort(right));
    }

    public PShortAdd(final int left, final PShort right) {
        this(new IntegerAsPShort(left), right);
    }

    public PShortAdd(final PShort left, final int right) {
        this(left, new IntegerAsPShort(right));
    }

    public PShortAdd(final PShort left, final PShort right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public short shortValue() {
        return (short)(left.shortValue() + right.shortValue());
    }

    private final PShort left;
    private final PShort right;
}
