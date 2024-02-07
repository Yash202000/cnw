package test1;



// Print the pattern
// Print the following pattern for the given number of rows.
// Pattern for N = 5
//  1    2   3    4   5
//  11   12  13   14  15
//  21   22  23   24  25
//  16   17  18   19  20
//  6    7    8   9   10
// Input format : N (Total no. of rows)

// Output format : Pattern in N lines

// Sample Input :
// 4
// Sample Output :
//  1  2  3  4
//  9 10 11 12
// 13 14 15 16
//  5  6  7  8

// Your Code
// Java (SE 1.8)
// 12345678910111213141516171819202122232425262728293031

// public class Solution {

// 	/* Input
// 	 * n - number of rows */
// 	public static void printPattern(int n){
// 		int[][] ans = new int[n][n];

// 		int top = 0, bottom = n-1, i=0, curr =1;
// 		while(i<n){


// CUSTOM INPUT


// SUBMIT SOLUTION


public class printPattern {

    public static void printPattern(int n){
		int[][] ans = new int[n][n];

		int top = 0, bottom = n-1, i=0, curr =1;
		while(i<n){
			if(i%2==0){
				for(int j=0;j<n;j++){
					ans[top][j] = curr;
					curr++;
				}
				top++;
			}
			else{
				for(int j=0;j<n;j++){
					ans[bottom][j] = curr;
					curr++;
				}
				bottom--;
			}

			i++;
		}

		for(int j=0;j<n;j++){
			for(int k=0;k<n;k++){
				System.out.print(ans[j][k]+" ");
			}
			System.out.println();
		}

	}
    
}
