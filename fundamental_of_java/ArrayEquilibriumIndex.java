public class ArrayEquilibriumIndex {
    public static int arrayEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        if (arr.length > 0) {
            if (arr.length == 1) {
                return 0;
            }

            int leftSum = 0, rightSum = totalSum - arr[0];
            int i = 1;

            while (i < arr.length) {
                if (leftSum == rightSum) {
                    return i-1;
                }

                leftSum += arr[i - 1];
                rightSum -= arr[i];
                i++;
            }
        }

        return -1;
    }
}
