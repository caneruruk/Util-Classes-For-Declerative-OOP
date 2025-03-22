package declerative.primitive.conversion;

import declerative.primitive.interfaces.PFloat;
import declerative.primitive.interfaces.PString;

final public class PFloatAsPString implements PString {
    public PFloatAsPString(final PFloat value) {
        this.value = value;
    }

    @Override
    public String strValue() {
        return String.valueOf(value.floatValue());
    }

    private final PFloat value;
}
