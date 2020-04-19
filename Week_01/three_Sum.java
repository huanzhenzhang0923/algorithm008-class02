import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> result=new LinkedList<List<Integer>>();
        for (int i=0;i<n-2;i++) {
            if (nums[i]>0) {
                return result;
            }
            if (i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            int left=i+1,right=n-1;
            while (left<right) {
                int sum=nums[left]+nums[right];
                if (sum==-nums[i]) {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while (left<n && nums[left]==nums[left-1]) {
                        left++;
                    }
                    while (right>0 && nums[right]==nums[right+1]) {
                        right--;
                    }
                }
                else if (sum<-nums[i]){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }
}
