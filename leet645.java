public class leet645 {
    public void swap(int i,int j, int[] A){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public int[] findErrorNums(int[] A) {
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
        int[] ans = new int[2];
        for(int j=0;j<n;j++){
            if(A[j] != j+1){
                ans[0] = A[j];
                ans[1] = j+1;
                break;
            }
        }
        return ans;
    }
}
