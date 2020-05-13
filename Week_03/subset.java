import java.util.LinkedList;
import java.util.List;

class subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> res = new LinkedList<>();
        helper(0,res, result,nums);
        return result;
    }

    private void helper(int pos, List<Integer> res, List<List<Integer>> result, int[] nums) {
        if (pos == nums.length) {
            result.add(new LinkedList<>(res));
            return;
        }
        res.add(nums[pos]);
        helper(pos+1, res, result, nums);
        res.remove(res.size()-1);
        helper(pos+1, res, result, nums);
    }
}