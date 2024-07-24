public class leet41 {
    public void swap(int i,int j, int[] A){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public int firstMissingPositive(int[] A) {
        int n = A.length;
        int i = 0;
        while(i<n){
            if(A[i] <1 || A[i] > n){
                i++;
                continue;
            }
            int correctIdx = A[i] - 1;
            if(A[correctIdx] != A[i]){
                swap(i,correctIdx,A);
            }
            else{
                i++;
            }
        }

        for(int j=0;j<n;j++){
            if(A[j] != j+1){
                return j+1;
            }
        }

        return n+1;
    }
}
