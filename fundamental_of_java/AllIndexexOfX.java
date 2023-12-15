public class AllIndexexOfX {
    public static int[] allIndexesHelper(int input[], int[] output, int currentOutputIndex, int i, int x) {
        if (i == input.length) {
            int[] result = new int[currentOutputIndex];
            System.arraycopy(output, 0, result, 0, currentOutputIndex);
            return result;
        }

        if (input[i] == x) {
            output[currentOutputIndex] = i;
            currentOutputIndex++;
        }

        return allIndexesHelper(input, output, currentOutputIndex, i + 1, x);
    }

	public static int[] allIndexes(int input[], int x) {
		int[] output = new int[input.length];
		return allIndexesHelper(input,output,0,0,x);
	}
}
