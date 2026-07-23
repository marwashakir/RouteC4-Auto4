package day7;

public class TextProcess {
    public static void main(String[] args) {
//        String s = "Hello big boy!";
//        System.out.println(s);
//        System.out.println(s.length());      // String.length()
//        System.out.println(s.toLowerCase()); // String.toLowerCase()
//        System.out.println(s.toUpperCase()); // String.toUpperCase()
//        System.out.println(s.charAt(3));     // String.charAt()
//
// reference point object
//        String a = "Islam";
//        String b = "Islam";
//        System.out.println(a == b);
//
//        String c = new String("Islam"); // new object HEAP
//        System.out.println(a == c);
//
//        System.out.println(a.equals(c)); // compare values
//        String text = "I love JAVA, java is fun.";
//        String lower = text.toLowerCase();
//        System.out.println(lower);
//        String upper = text.toUpperCase();
//        System.out.println(upper);
//        System.out.println(text.indexOf('a'));        // first occurrence 14
//        System.out.println(text.lastIndexOf('a'));    // last occurrence 16
        countWords("Kareem Taha Abd El-Fattah Mohammed");
        reverseWords("Kareem Taha Abd El-Fattah Mohammed");
    }
    // Method => count number of words in a text
    public static void countWords(String text)
    {
        String[] words = text.split(" "); //split by space
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }
    public static void reverseWords(String text)
    {
        String reversedText = "";
        for(int i = text.length() - 1; i >= 0; i--)
        {
            reversedText = reversedText + text.charAt(i);
        }
        System.out.println(reversedText);
    }
}