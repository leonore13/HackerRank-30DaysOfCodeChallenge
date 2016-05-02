import java.util.Scanner;

/**
 * Created by sophianguyen on 2016-05-02.
 *
 * This is the Day 0 challenge from the HackerRank 30 Days of Code Challenge:
 * https://www.hackerrank.com/challenges/30-hello-world
 */
public class Day0 {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        System.out.println("Hello, World.");
        System.out.println(s);

    }
}
