//********************************************************************************************************************
//You are the manager of a number of employees who all sit in a row.
// The CEO would like to give bonuses to all of your employees,
// but since the company did not perform so well this year the CEO would like to keep the bonuses to a minimum.
//
//        The rules of giving bonuses is that:
//        - Each employee begins with a bonus factor of 1x.
//        - For each employee, if they perform better than the person sitting next to them,
//        the employee is given +1 higher bonus (and up to +2 if they perform better than both people to their sides).
//
//        Given a list of employee's performance, find the bonuses each employee should get.
//
//        Example:
//        Input: [1, 2, 3, 2, 3, 5, 1]
//        Output: [1, 2, 3, 1, 2, 3, 1]
//*********************************************************************************************************************

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] inp = {1, 2, 3, 2, 3, 5, 1};
        int[] output = getResult(inp);
        for(int a: output){
            System.out.println(a);
        }

    }

    private static int[] getResult(int[] inp) {
        int[] result = new int[inp.length];
        Arrays.fill(result,1);
        if(inp.length < 2){
            return result;
        }
        for(int i = 0;i < inp.length; i++){
            if(i==0){
                if(inp[i]> inp[i+1]){
                    result[i]++;
                }
            }else if(i==inp.length-1){
                if(inp[i] > inp[i-1]){
                    result[i]++;
                }
            } else {
                if(inp[i]> inp[i-1] || inp[i] > inp[i+1]){
                    result[i]++;
                }
                if(inp[i]> inp[i-1] && inp[i] > inp[i+1]){
                    result[i]++;
                }
            }

        }
        return result;
    }
}
