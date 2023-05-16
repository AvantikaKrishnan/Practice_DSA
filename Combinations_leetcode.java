import java.util.*;
public class Combinations_leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        List<List<Integer>> c = new ArrayList<List<Integer>>();
        System.out.println(helper(1, k, n, a, c));
    }
    public static List<List<Integer>> helper(int p, int k, int n, ArrayList<Integer> f, List<List<Integer>> b) {
        if(k==0)
        {
            b.add(new ArrayList(f));
        }
        else {
            while(p<=n)
            {
                f.add(p++);
                helper(p,k-1,n,f,b);
                f.remove(f.size()-1);
            }
        } // after all recursion is over it returns final value b
        return b;
    }
}
