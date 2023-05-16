import java.util.*;
public class combination_sum_leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        List<List<Integer>> c = new ArrayList<List<Integer>>();
        System.out.println(helper(arr,n, target, 0, a,c,0));
    }
    public static List<List<Integer>> helper(int arr[] , int n, int target, int sum, ArrayList<Integer> a, List<List<Integer>> c, int j)
    {
        if(sum == target)
        {
            c.add(new ArrayList(a));

        }
        else {
            for(int i =j;i<n;i++)
            {
                sum += arr[i];
                if(sum<=target){
                    a.add(arr[i]);
                    helper(arr,n,target,sum,a,c,i); // to avoid starting from start and getting sets which are ideally same we use int j
                    sum -= arr[i];
                    a.remove(a.size()-1);
                }
                else {
                    sum -= arr[i];
                    continue;
                }
            }
        }

        return c;
    }
}

