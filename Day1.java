import java.util.Scanner;

/**
 * Created by sophianguyen on 2016-05-02.
 */

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

         /* Declare second integer, double, and String variables. */
        int a;
        double b;
        String c;
        String e;

        /* Read and save an integer, double, and String to your variables.*/

        System.out.println("Please enter an integer.");
        a = scan.nextInt();

        System.out.println("Now enter a double.");
        b = scan.nextDouble();

        System.out.println("Finally, enter a string!");
        c = scan.nextLine();
        e = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */

        int sum = i + a;
        System.out.println(sum);

        /* Print the sum of the double variables on a new line. */

        double sum2 = d + b;
        System.out.println(sum2);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        String concat = s.concat(e);
        System.out.println(concat);

        scan.close();

    }
}