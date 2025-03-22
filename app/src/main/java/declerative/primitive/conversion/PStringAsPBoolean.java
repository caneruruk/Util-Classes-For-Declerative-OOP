package declerative.primitive.conversion;

import declerative.primitive.interfaces.PBoolean;
import declerative.primitive.interfaces.PString;

final public class PStringAsPBoolean implements PBoolean {
    public PStringAsPBoolean(final PString value) {
        this.value = value;
    }

    @Override
    public boolean boolValue() {
        return Boolean.parseBoolean(value.strValue());
    }

    private final PString value;
}
