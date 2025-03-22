package declerative.primitive.conversion;

import declerative.primitive.interfaces.PFloat;
import declerative.primitive.interfaces.PString;

final public class PStringAsPFloat implements PFloat {
    public PStringAsPFloat(final PString value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return Float.parseFloat(value.strValue());
    }

    private final PString value;
}
