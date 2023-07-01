import java.util.*;
public class Powers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(helper(x,n));
    }
    public static double helper(double x, int n)
    {
        if(n==0)
            return 1;
        double temp = helper(x,n/2);
        if(n>0)
        {
            if(n%2 != 0)
                return temp*temp*x;
            return temp*temp;
        }
        else
        {
            if(n%2 != 0)
                return temp*temp*(1/x);
            return temp*temp;
        }
    }
}
