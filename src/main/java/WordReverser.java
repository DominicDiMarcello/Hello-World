import java.util.ArrayList;

public class WordReverser {

    String inputString;
    ArrayList<String> reversedWords = new ArrayList<String>();
    WordReverser (String inputString) {
        this.inputString = inputString;
    }


    public void reverseWords() {
        String[] s = inputString.split(" ");
        for (int i = s.length-1; i >= 0; i--) {
           reversedWords.add(s[i]);
        }
    }

    public String getReversedWords() {
        String reversedWordsString = String.join(" ", reversedWords);
        return "" + reversedWordsString;
    }

    public String getWordCount() {
        return "" + reversedWords.size();
    }


}
