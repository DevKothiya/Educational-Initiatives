package structuralDesignPattern.decorator;

import structuralDesignPattern.decorator.text.PlainText;
import structuralDesignPattern.decorator.text.Text;
import structuralDesignPattern.decorator.textDecorator.BoldDecorator;
import structuralDesignPattern.decorator.textDecorator.ItalicDecorator;
import structuralDesignPattern.decorator.textDecorator.UnderlinedDecorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        PlainText text = new PlainText("Educational Initiative");

        Text boldText = new BoldDecorator(text);
        Text styledText = new ItalicDecorator(new BoldDecorator(new UnderlinedDecorator(text)));

        System.out.println("Bold Text: " + boldText.render());
        System.out.println("Styled Text: " + styledText.render());
    }
}
