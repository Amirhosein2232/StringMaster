import java.util.Scanner;

public class Main {
    public static String doubleChar( String word ) {
        int length = word.length();
        for ( int i = 1 ; i < length ; i++ ) {
            if ( word.charAt(i-1) == word.charAt(i) ) {
                String word1 = word.substring(0,i-1);
                String word2 = word.substring(i,length);
                String word3 = doubleChar(word1 + word2 );
                return word3;
            }
        }
        return word;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(doubleChar(word));
    }
}