import java.util.*;
class lettercombination_phone
{
    public void letterCombinations(String digits) {
      //  List<String> list = new ArrayList<String>();
         List<String> ans = helper("", digits);
         System.out.println(ans);
        
    }
    public List<String> helper(String p ,String up){
        if(up.isEmpty())
        {
           ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;

        }

        int c = up.charAt(0)-'0';
        
        List<String> left = new ArrayList<String>();
        
        if(c < 7)
        {
            for(int i = (c-2)*3; i < (c-1)*3; i++)
            {
                char ch = (char)('a' + i);
                left.addAll(helper(p+ch,up.substring(1)));

            }
        }
        else if(c==7 )
        {
            for(int i = (c-2)*3; i <= (c-1)*3; i++)
            {
                char ch = (char)('a' + i);
                left.addAll(helper(p+ch,up.substring(1)));

            }

        }
        else if(c == 8)
        {
            for(int i = (c-2)*3+1; i <= ((c-1)*3); i++)
            {
                char ch = (char)('a' + i);
                left.addAll(helper(p+ch,up.substring(1)));

            }

        }
        else
        {
            for(int i = (c-2)*3+1; i <= ((c-1)*3)+1; i++)
            {
                char ch = (char)('a' + i);
                left.addAll( helper(p+ch,up.substring(1)));

            }

        }
         return left;
        
        
        

        }

    }

