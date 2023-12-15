public class CountZeros {
    public static int countZerosRecHelper(int input, int count){
		if(input==0) return count;
		if(input%10==0) count++;
		return  countZerosRecHelper(input/10,count);
		
	}

	public static int countZerosRec(int input){
			if(input==0) return 1;
           
			return countZerosRecHelper(input, 0);
	}
}
