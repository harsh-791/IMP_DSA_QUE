import java.util.ArrayList;
import java.util.List;

public class leet448 {
    public void swap(int i, int correctIdx, int[] nums){
        int temp = nums[i];
        nums[i] = nums[correctIdx];
        nums[correctIdx] = temp;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int correctIdx = nums[i]-1;
            if(nums[correctIdx] != nums[i]){
                swap(i,correctIdx,nums);
                i--;
            }

        }

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] != i+1){
                ans.add(i+1);
            }
        }

        return ans;
    }
}
