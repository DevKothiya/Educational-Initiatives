package behavioralDesignPattern.memento;

public class MementoDemo {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Ver1: Educational");
        history.save(editor.save());

        editor.write("Ver2: Initiatives");
        history.save(editor.save());

        editor.write("Ver3: Design Patterns");

        System.out.println("Current Content: " + editor.getContent());

        // Undo operation
        editor.restore(history.undo());
        System.out.println("After Undo 1: " + editor.getContent());

        editor.restore(history.undo());
        System.out.println("After Undo 2: " + editor.getContent());
    }
}