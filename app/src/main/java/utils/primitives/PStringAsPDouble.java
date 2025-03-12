package utils.primitives;

import utils.primitives.interfaces.PDouble;
import utils.primitives.interfaces.PString;

final public class PStringAsPDouble implements PDouble {
    public PStringAsPDouble(final String value) {
        this(new StringAsPString(value));
    }

    public PStringAsPDouble(final PString value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return Double.parseDouble(value.strValue());
    }

    private final PString value;
}
