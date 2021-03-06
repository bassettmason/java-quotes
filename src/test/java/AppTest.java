/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testWebQuoteGetter() {
        QuoteGetter getter = new WebQuoteGetter();
        Quote newQuote = getter.getQuote();

        assertTrue(newQuote.toString().contains("Ron Swanson"));
    }

    @Test
    public void testFileSystemQuoteGetter() {
        QuoteGetter getter = new FileSystemQuoteGetter("resources/recentquotes.json");
        Quote newQuote = getter.getQuote();

        assertTrue(newQuote.toString().contains("--"));
    }
    @Test
    public void testGetRandomQuote() {
        QuoteGetter getter = new FileSystemQuoteGetter("resources/recentquotes.json");


        Quote[] results = new Quote[2];

        for (int i = 0; i < 1; i++) {
            results[i] = (getter.getQuote());
        }
        assertTrue(results[0] != results[1]);
    }
}
