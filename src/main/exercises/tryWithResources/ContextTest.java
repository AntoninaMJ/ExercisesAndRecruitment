package main.exercises.tryWithResources;

public class ContextTest {
    public static void main(String[] args) {
        try (
                ContextManager h1 = new ContextManager("h1");      // (BufferedReader or Smth implements AutoCloseable)
                ContextManager em = new ContextManager("em")
        ) {
            h1.body("one text: ");
            em.body("second text: ");
        }
    }
}