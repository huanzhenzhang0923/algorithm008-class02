class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length, count=0;
        k=k%n;
        for (int start=0; count<n;start++) {
            int current=start;
            int pre=nums[current];
            do {
                int temp=nums[(current+k)%n];
                nums[(current+k)%n]=pre;
                pre=temp;
                current=(current+k)%n;
                count++;
            }
            while (current!=start);
        }
    }
}