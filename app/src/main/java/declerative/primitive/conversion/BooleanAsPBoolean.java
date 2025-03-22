package declerative.primitive.conversion;

import declerative.primitive.interfaces.PBoolean;

final public class BooleanAsPBoolean implements PBoolean {
    public BooleanAsPBoolean(final boolean value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return value;
    }

    private final boolean value;
}
