package declerative.primitive.conversion;

import declerative.primitive.interfaces.PDouble;
import declerative.primitive.interfaces.PString;

final public class PStringAsPDouble implements PDouble {
    public PStringAsPDouble(final PString value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return Double.parseDouble(value.strValue());
    }

    private final PString value;
}
