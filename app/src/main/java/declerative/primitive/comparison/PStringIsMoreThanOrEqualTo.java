package declerative.primitive.comparison;

import declerative.primitive.arithmetic.PBooleanOr;
import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PString;

final public class PStringIsMoreThanOrEqualTo implements PBoolean {
    public PStringIsMoreThanOrEqualTo(final PString left, final PString right) {
        this(new PBooleanOr(new PStringIsMoreThan(left, right), new PStringIsEqualTo(left, right)));
    }

    public PStringIsMoreThanOrEqualTo(final PBoolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value.boolValue();
    }

    private final PBoolean value;
}
