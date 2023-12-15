public class SumOfDigitsRecursive {
    public static int sumOfDigitsHelper(int input, int sum){
		if(input==0) return sum;
		
		sum += input%10;
		
		return sumOfDigitsHelper(input/10,sum);
	}

	public static int sumOfDigits(int input){
		return sumOfDigitsHelper(input,0);
	}
}
