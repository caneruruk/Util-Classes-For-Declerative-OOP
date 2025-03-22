package declerative.primitive.conversion;

import declerative.primitive.interfaces.PDouble;
import declerative.primitive.interfaces.PString;

final public class PDoubleAsPString implements PString {
    public PDoubleAsPString(final PDouble value) {
        this.value = value;
    }

    @Override
    public String strValue() {
        return String.valueOf(value.doubleValue());
    }

    private final PDouble value;
}
