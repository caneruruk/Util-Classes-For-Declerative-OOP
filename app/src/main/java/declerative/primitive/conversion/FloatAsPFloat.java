package declerative.primitive.conversion;
import declerative.primitive.interfaces.PFloat;

final public class FloatAsPFloat implements PFloat {
    public FloatAsPFloat(final float value) {
        this.value = value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    private final float value;
}
