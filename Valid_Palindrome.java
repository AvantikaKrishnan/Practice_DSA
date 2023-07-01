import java.util.*;
public class Valid_palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        System.out.println(helper(s, 0, (l - 1), 0));
    }

    public static boolean helper(String s, int p1, int p2, int c) {
        while (p1 <= p2) {

            if (!(Character.isLetter(s.charAt(p1)) || Character.isDigit(s.charAt(p1)))) {
                p1++;

            } else if (!(Character.isLetter(s.charAt(p2)) || Character.isDigit(s.charAt(p2)))) {
                p2--;

            } else if (Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2)))
                return false;
            else {

                p1++;
                p2--;


            }
        }
        return true;
    }
}
