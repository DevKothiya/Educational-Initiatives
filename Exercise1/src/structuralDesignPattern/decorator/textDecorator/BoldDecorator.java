package structuralDesignPattern.decorator.textDecorator;

import structuralDesignPattern.decorator.text.Text;
import structuralDesignPattern.decorator.text.TextDecorator;

public class BoldDecorator extends TextDecorator {
    public BoldDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<b>" + super.render() + "</b>";
    }
}
