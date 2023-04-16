package document;

public class WordCount {
    private static final int NOTFOUND = -1;
    private static final int INIT_SIZE = 10;
    // private final array of type "String" named "words"
    private final String[] words = new String[INIT_SIZE];
    // private final array of type "int" named "frequencies"
    private final int[] frequencies = new int[INIT_SIZE];
    // private "int" named "count"
    private int count;
    
    // initialize words and frequencies to arrays of size "INIT_SIZE" = 10
    
    /* 
    a public method named "addWord" that receives a String named "word" and 
    return a "boolean". It returns false if the word is null or blank.
    Otherwise, It adds the "word" into "words" array and set its "frequency" to 1 
    if "word" does not already exist and increments the "count". 
    However, if the arrays are full, the "word" cannot be added into the "words" array, 
    it returns false.  If the "word" has already existed in the "words" array, 
    increments the "frequency" of that "word".
    */
    public boolean addWord(String word) {
        if (word == null || word.isBlank()) return false;
        int i = positionOf(word);
        if (i == NOTFOUND) {
            if (count == words.length) return false;
            words[count] = word;
            frequencies[count] = 1;
            count++;
            return true;
        }
        frequencies[i]++;
        return true;
    }
    private int positionOf(String word) {
        for (int i = 0; i < count; i++) {
            if (word.equals(words[i])) return i;
        }
        return NOTFOUND;
    }
    
    /*
    override the "toString()" method that returns a "String" showing each word 
    along with its frequencies. E.g.,
       "word1" 2, "word2" 5, "word3" 1, "word4" 3, ...
    */
    @Override 
    public String toString() {
        var b = new StringBuilder();
        for (int i = 0; i < count; i++) {
            b.append(words[i]);
            b.append(" ");
            b.append(frequencies[i]);
            b.append(", ");
        }
        return b.toString();
    }
}
