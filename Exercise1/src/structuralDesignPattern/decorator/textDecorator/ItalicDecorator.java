package structuralDesignPattern.decorator.textDecorator;

import structuralDesignPattern.decorator.text.Text;
import structuralDesignPattern.decorator.text.TextDecorator;

public class ItalicDecorator extends TextDecorator {

    public ItalicDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<i>" + super.render() + "</i>";
    }
}
