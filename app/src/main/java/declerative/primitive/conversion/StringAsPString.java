package declerative.primitive.conversion;
import declerative.primitive.interfaces.PString;

final public class StringAsPString implements PString {
    public StringAsPString(final String value) {
        this.value = value;
    }

    @Override
    public String strValue() {
        return value;
    }

    private final String value;
}
