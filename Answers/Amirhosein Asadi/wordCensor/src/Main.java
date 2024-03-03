import java.util.Scanner;

public class Main {
    public static void wordCensor(String sentence , String word , String newword ) {
        int i = sentence.indexOf(word);
        int j = i + word.length();
        int p = sentence.length();
        String str1 = sentence.substring(0,i);
        String str2 = sentence.substring(j,p);
        System.out.println(str1 + newword + str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.nextLine();
        String newword = sc.nextLine();
        wordCensor(sentence,word,newword);
    }
}