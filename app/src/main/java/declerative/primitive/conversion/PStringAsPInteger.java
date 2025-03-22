package declerative.primitive.conversion;

import declerative.primitive.interfaces.PInteger;
import declerative.primitive.interfaces.PString;

final public class PStringAsPInteger implements PInteger {
    public PStringAsPInteger(final PString value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return Integer.parseInt(value.strValue());
    }

    private final PString value;
}
