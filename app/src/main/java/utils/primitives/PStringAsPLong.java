package utils.primitives;

import utils.primitives.interfaces.PLong;
import utils.primitives.interfaces.PString;

final public class PStringAsPLong implements PLong {
    public PStringAsPLong(final String value) {
        this(new StringAsPString(value));
    }

    public PStringAsPLong(final PString value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return Long.parseLong(value.strValue());
    }

    private final PString value;
}
