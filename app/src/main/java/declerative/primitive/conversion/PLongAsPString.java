package declerative.primitive.conversion;

import declerative.primitive.interfaces.PLong;
import declerative.primitive.interfaces.PString;

final public class PLongAsPString implements PString {
    public PLongAsPString(final PLong value) {
        this.value = value;
    }

    @Override
    public String strValue() {
        return String.valueOf(value.longValue());
    }

    private final PLong value;
}
