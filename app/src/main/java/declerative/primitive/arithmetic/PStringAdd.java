package declerative.primitive.arithmetic;

import declerative.primitive.interfaces.PString;

final public class PStringAdd implements PString {
    public PStringAdd(final PString left, final PString right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String strValue() {
        return left.strValue() + right.strValue();
    }

    private final PString left;
    private final PString right;
}
