import java.util.*;
public class n_digit_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        helper(n,sum,"",list);
    }
    public static void helper(int n, int sum,String result,List<Integer> list)
    {
       if(n>0 && sum>=0)
       {
           char d = '0';
           if(result.equals(""))
               d='1';
           while(d<= '9' )
           {
               helper(n-1,sum - (d-'0'),result+d,list);
               d++;
           }
       }
       else if(n==0 && sum == 0) {
           System.out.println(result);
       }
    }
}
