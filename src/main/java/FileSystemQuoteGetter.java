import java.io.IOException;

public class FileSystemQuoteGetter implements QuoteGetter {
    public Quote[] quotes;
    public String quotesPath;



    public FileSystemQuoteGetter(String path) {
        this.quotesPath = path;
    }
    @Override
    public Quote getQuote() {
        if (this.quotes == null) {
            this.readQuotes();
        }
        return this.getRandom(quotes);
    }
//Returns a quote from the array of quotes randomly
    public Quote getRandom(Quote[] quotes) {
        //return quotes at index [get a random number under 1 * the length of the array]
        return this.quotes[(int)(Math.random() * this.quotes.length)];
    }
    public void readQuotes () {
        try {
            this.quotes = FileSystemQuotes.getQuotes(this.quotesPath);
        }catch (IOException e) {
            this.quotes = new Quote[]{new Quote("hey opps", "mason")};
        }
    }


}
