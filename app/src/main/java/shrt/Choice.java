package shrt;

final public class Choice implements Interface {
    public Choice(final bool.Interface conditional, final Interface trueValue, final Interface falseValue) {
        this.conditional = conditional;
        this.trueValue = trueValue;
        this.falseValue = falseValue;
    }

    @Override
    public short value() {
        if(conditional.value())
            return trueValue.value();

        return falseValue.value();
    }

    private final bool.Interface conditional;
    private final Interface trueValue;
    private final Interface falseValue;
}
