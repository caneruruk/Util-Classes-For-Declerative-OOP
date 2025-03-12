package utils.primitives;

import utils.primitives.interfaces.PShort;
import utils.primitives.interfaces.PString;

final public class PStringAsPShort implements PShort {
    public PStringAsPShort(final String value) {
        this(new StringAsPString(value));
    }

    public PStringAsPShort(final PString value) {
        this.value = value;
    }

    @Override
    public short shortValue() {
        return Short.parseShort(value.strValue());
    }

    private final PString value;
}
