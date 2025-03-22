package declerative.primitive.comparison;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PString;

final public class PStringIsLessThan implements PBoolean {
    public PStringIsLessThan(final PString left, final PString right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean boolValue() {
        return left.strValue().compareTo(right.strValue()) < 0;
    }

    private final PString left;
    private final PString right;
}
