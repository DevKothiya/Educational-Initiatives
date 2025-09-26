package structuralDesignPattern.decorator.text;

public class PlainText implements Text {

    private final String content;

    public PlainText(String content) {
        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("Text content cannot be null or empty");
        }
        this.content = content;
    }

    @Override
    public String render() {
        return content;
    }
}
