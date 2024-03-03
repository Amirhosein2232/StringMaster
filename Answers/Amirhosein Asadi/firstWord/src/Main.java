import java.util.Scanner;

public class Main {
    public static void firstWord( String wordA , String wordB ) {
        int lengthA = wordA.length();
        int lengthB = wordB.length();
        int smallerLength;
        if ( lengthA >= lengthB ) {
            smallerLength = lengthB;
        }
        else {
            smallerLength = lengthA;
        }
        for ( int i = 0 ; i < smallerLength ; i++ ) {
            int a = wordA.charAt(i);
            int b = wordB.charAt(i);
            if ( a < b ) {
                System.out.println(wordA);
                break;
            }
            else if ( a > b ) {
                System.out.println(wordB);
                break;
            }
            else if ( i == smallerLength-1 ) {
                if ( lengthA <= lengthB ) {
                    System.out.println(wordA);
                }
                else {
                    System.out.println(wordB);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordA = sc.nextLine();
        String wordB = sc.nextLine();
        firstWord(wordA,wordB);
    }
}