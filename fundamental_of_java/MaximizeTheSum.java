public class MaximizeTheSum {
    public static int max(int x,int y){
		return (x>y)? x : y;
	}

	public static long maximumSumPath(int[] input1, int[] input2) {
		int i=0,j=0;

		int m = input1.length,n = input2.length;

		int result = 0, sum1 = 0,sum2 = 0;

		while(i<m&& j<n){
			if(input1[i]<input2[j]){
				sum1+=input1[i++];
			}
			else if(input1[i]>input2[j]){
				sum2+=input2[j++];
			}

			else{
				result+= max(sum1,sum2)+input1[i];

				sum1=0;
				sum2=0;

				i++;
				j++;
			}
		}
		
		while(i<m){
			sum1+=input1[i++];
		}

		while(j<n){
			sum2+=input2[j++];
		}


		result+=max(sum1,sum2);

		return result;

	} 
}
