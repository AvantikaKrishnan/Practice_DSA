public void nextPermutation(int[] nums) {

        int ind1 = -1;
        int ind2 = -1;

        for(int i = nums.length-2 ; i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind1 = i;
                break;
            }
        }

        if(ind1 == -1)
        {
            reverse(nums,0);
        }
        else
        {
            for(int i = nums.length-1;i>=0;i--)
            {
                if(nums[i] > nums[ind1])
                {
                    ind2 = i;
                    break;
                }
            }

            swap(nums,ind1,ind2);

            reverse(nums, ind1+1);
        }
        
    }

    public void swap(int nums[] , int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void reverse(int nums[] , int start)
    {
        int end = nums.length-1;
        while(start<end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }
    }
