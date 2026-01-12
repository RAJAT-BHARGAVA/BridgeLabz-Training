class TextState {
    String content;
    TextState prev;
    TextState next;

    TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class TextEditor {
    private TextState head;
    private TextState tail;
    private TextState current;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add new text state
    public void addState(String content) {
        TextState newState = new TextState(content);

        // If undo was used, remove all redo states
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }

        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;

        // Limit history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo.");
            return;
        }
        current = current.prev;
        displayCurrentState();
    }

    // Redo operation
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo.");
            return;
        }
        current = current.next;
        displayCurrentState();
    }

    // Display current text
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty.");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }
}

public class TextEditorApp {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.addState("H");
        editor.addState("He");
        editor.addState("Hel");
        editor.addState("Hell");
        editor.addState("Hello");

        editor.displayCurrentState();

        System.out.println("\nUndo:");
        editor.undo();
        editor.undo();

        System.out.println("\nRedo:");
        editor.redo();

        System.out.println("\nTyping new text:");
        editor.addState("Hello World");

        editor.displayCurrentState();
    }
}
