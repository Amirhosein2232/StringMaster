import java.util.Scanner;

public class Main {
    public static void normalizingName( String firstName , String lastName ) {
        String fname = firstName.toLowerCase();
        String a = fname.substring(0,1);
        String b = a.toUpperCase();
        String first = b + fname.substring(1);
        String lname = lastName.toLowerCase();
        String i = lname.substring(0,1);
        String j = i.toUpperCase();
        String last = j + lname.substring(1);
        System.out.println(first + " " + last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        normalizingName(firstName,lastName);
    }
}