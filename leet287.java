public class leet287 {
    public void swap(int i,int j, int[] A){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public int findDuplicate(int[] A) {
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

        for(int j=0;j<n;j++){
            if(A[j] != j+1){
                return A[j];
            }
        }

        return n+1;
    }
}
