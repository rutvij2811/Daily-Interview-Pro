//****************************************************************************
//You are given an array of integers. Return the length of the
// longest increasing subsequence (not necessarily contiguous) in the array.
//
// Example:
//  [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15]
//
//  The following input should return 6 since the longest
//  increasing subsequence is 0, 2, 6, 9 , 11, 15.
//  Definitely a DP Problem
//*****************************************************************************


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inp = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        int result = getLongestSequence(inp,inp.length);
        System.out.println(result);
    }

    private static int getLongestSequence(int[] inp, int n) {
        int[] lis = new int[n];
        Arrays.fill(lis,1);
        for(int i =1;i <n;i++){
            for(int j = 0; j<i;j++){
                if(inp[j] < inp[i]){
                    lis[i] = Math.max(lis[i],lis[j]+1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0;i < n;i++){
            if(lis[i]> max){
                max = lis[i];
            }
        }
        return max;
    }
}
