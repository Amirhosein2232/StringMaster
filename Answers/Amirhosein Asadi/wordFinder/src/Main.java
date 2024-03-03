import java.util.Scanner;

public class Main {
    public static void wordFinder( String sentence , int number ) {
        int length = sentence.length();
        int j = 0;
        int count = 1;
        for ( int i = 0 ; i < length ; i++ ) {
            int a = sentence.charAt(i);
            if ( (a == 32) || ( i == length-1 ) ) {
                if ( number == count ) {
                    System.out.println(sentence.substring(j,++i));
                    break;
                }
                else {
                    j=++i;
                    count++;
                }
            }
        }
        if ( count < number ) {
            System.out.println(number + " is out Of Bound");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int number = sc.nextInt();
        wordFinder(sentence,number);
    }
}