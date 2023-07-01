import java.util.*;
public class Valid_Palindrome_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        System.out.println(helper(s, 0, (l - 1),false));
    }

    public static boolean helper(String s, int p1, int p2, boolean flag) {
        while (p1 <= p2) {
            if (!(Character.isLetter(s.charAt(p1)) || Character.isDigit(s.charAt(p1)))) {
                p1++;

            } else if (!(Character.isLetter(s.charAt(p2)) || Character.isDigit(s.charAt(p2)))) {
               p2--;

            } else if (Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))) {
                if (!flag) {
                    return helper(s, p1, p2 - 1, true) || helper(s, p1 + 1, p2, true);

                } else
                    return false;
            } else {
               p1++;
               p2--;

            }
        }
        return true;
    }
}
