package declerative.primitive.conversion;
import declerative.primitive.interfaces.PLong;

final public class LongAsPLong implements PLong {
    public LongAsPLong(final long value) {
        this.value = value;
    }

    @Override
    public long longValue() {
        return value;
    }

    private final long value;
}
