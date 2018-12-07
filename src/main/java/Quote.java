public class Quote {
    public String text;
//    public String[] tags;
    public String author;
//    public String likes;


    public Quote(String text, String author){
//        this.tags = tags;
        this.text = text;
        this.author = author;
//        this.likes = likes;

    }

    public String toString(){
        return "Quote: \n" + text + "\n" + "--" + author;
    }
}
