package main.exercises.tryWithResources;

public class ContextManager implements AutoCloseable {
    private String tag;

    ContextManager(String tag) {
        System.out.println("<" + tag + ">");
        this.tag = tag;
    }

    void body(String text) {
        System.out.println(text + tag);
    }

    @Override
    public void close() {
        System.out.println("</" + tag + ">");

    }
}