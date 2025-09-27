package behavioralDesignPattern.memento;

import java.util.Stack;

/**
 * Caretaker
 */
public class History {

    private Stack<Memento> states = new Stack<>();

    public void save(Memento memento) {
        states.push(memento);
    }

    public Memento undo() {
        if (!states.isEmpty()) {
            return states.pop();
        }
        return null;
    }
}
