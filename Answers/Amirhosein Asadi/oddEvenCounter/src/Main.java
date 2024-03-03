import java.util.Scanner;

public class Main {
    public static int oddEvenCounter( String number , boolean searchForEven ) {
        int lenght = number.length();
        int value = 0;
        if ( searchForEven ) {
            for ( int i = 0 ; i < lenght ; i++ ) {
                int j = number.charAt(i);
                if ( j % 2 == 0 ) {
                    value++;
                }
            }
        }
        else {
            for ( int i = 0 ; i < lenght ; i++ ) {
                int j = number.charAt(i);
                if ( j % 2 == 1 ) {
                    value++;
                }
            }
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        boolean searchForEven = sc.nextBoolean();
        System.out.println(oddEvenCounter( number , searchForEven ));
    }
}