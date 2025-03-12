package utils.primitives;

import utils.primitives.interfaces.PInteger;

final public class PIntegerAdd implements PInteger {
    public PIntegerAdd(final String left, final int right) {
        this(new PStringAsPInteger(left), new IntegerAsPInteger(right));
    }

    public PIntegerAdd(final int left, final String right) {
        this(new IntegerAsPInteger(left), new PStringAsPInteger(right));
    }

    public PIntegerAdd(final String left, final String right) {
        this(new PStringAsPInteger(left), new PStringAsPInteger(right));
    }

    public PIntegerAdd(final String left, final PInteger right) {
        this(new PStringAsPInteger(left), right);
    }

    public PIntegerAdd(final PInteger left, final String right) {
        this(left, new PStringAsPInteger(right));
    }

    public PIntegerAdd(final int left, final int right) {
        this(new IntegerAsPInteger(left), new IntegerAsPInteger(right));
    }

    public PIntegerAdd(final int left, final PInteger right) {
        this(new IntegerAsPInteger(left), right);
    }

    public PIntegerAdd(final PInteger left, final int right) {
        this(left, new IntegerAsPInteger(right));
    }

    public PIntegerAdd(final PInteger left, final PInteger right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int intValue() {
        return left.intValue() + right.intValue();
    }

    private final PInteger left;
    private final PInteger right;
}
