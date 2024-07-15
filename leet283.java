class leet283 {
    public static void moveZeroes(int[] A) {
        int s = 0;
        int curr = 0;

        for (curr = 0; curr < A.length; curr++) {
            if (A[curr] != 0) {
                int temp = A[s];
                A[s] = A[curr];
                A[curr] = temp;
                s++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Original array:");
        printArray(arr);

        moveZeroes(arr);

        System.out.println("Array after moving zeroes:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


