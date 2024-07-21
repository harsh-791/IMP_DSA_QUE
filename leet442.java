import java.util.ArrayList;
import java.util.List;

public class leet442 {
    public void swap(int i,int j, int[] A){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public List<Integer> findDuplicates(int[] A) {
        int n = A.length;
        int i = 0;
        while(i<n){
            int correctIdx = A[i] - 1;
            if(A[correctIdx] != A[i]){
                swap(i,correctIdx,A);
            }
            else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<n;j++){
            if(A[j] != j+1){
                ans.add(A[j]);
            }
        }

        return ans;
    }
}
