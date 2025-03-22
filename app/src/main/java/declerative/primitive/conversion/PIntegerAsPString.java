package declerative.primitive.conversion;

import declerative.primitive.interfaces.PInteger;
import declerative.primitive.interfaces.PString;

final public class PIntegerAsPString implements PString {
    public PIntegerAsPString(final PInteger value) {
        this.value = value;
    }

    @Override
    public String strValue() {
        return String.valueOf(value.intValue());
    }

    private final PInteger value;
}
