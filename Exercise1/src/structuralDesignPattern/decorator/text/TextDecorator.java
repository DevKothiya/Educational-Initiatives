package structuralDesignPattern.decorator.text;

public abstract class TextDecorator implements Text {
    public final Text text;


    protected TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text.render();
    }

}
