public class Main {
    public static void main(String[] args) /* throws Exception */{
        reverseWorders();
    }

    public static void textArt() throws Exception {
        var a = new ASCIIArt();
        a.generate("Hello");
    }

    public static void reverseWorders() {
        var wordReverser = new WordReverser("This is a test");
        wordReverser.reverseWords();
        System.out.println(wordReverser.getReversedWords());
        System.out.println(wordReverser.getWordCount());
    }
}


