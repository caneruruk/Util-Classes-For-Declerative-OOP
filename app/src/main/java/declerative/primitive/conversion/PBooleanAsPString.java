package declerative.primitive.conversion;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PString;

final public class PBooleanAsPString implements PString {
    public PBooleanAsPString(final PBoolean value) {
        this.value = value;
    }

    @Override
    public String strValue() {
        return String.valueOf(value.boolValue());
    }

    private final PBoolean value;
}
