package structuralDesignPattern.decorator.textDecorator;

import structuralDesignPattern.decorator.text.Text;
import structuralDesignPattern.decorator.text.TextDecorator;

public class UnderlinedDecorator extends TextDecorator {
    public UnderlinedDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<u>" + super.render() + "</u>";
    }


}
