package int101retrain2;

import document.WordCount;

public class Int101retrain2 {

    public static void main(String[] args) {
        WordCount wc = new WordCount();
        System.out.println("WordCount: " + wc);
        System.out.println("add One: " + wc.addWord("One"));
        System.out.println("WordCount: " + wc);
        System.out.println("add One: " + wc.addWord("One"));
        System.out.println("WordCount: " + wc);
        System.out.println("add Two: " + wc.addWord("Two"));
        System.out.println("add One: " + wc.addWord("One"));
        System.out.println("WordCount: " + wc);
        System.out.println("add Three: " + wc.addWord("Three"));
        System.out.println("add Two: " + wc.addWord("Two"));
        System.out.println("WordCount: " + wc);
    }
}
