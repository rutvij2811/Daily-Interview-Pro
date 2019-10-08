//************************************************************************************************************
//Given a time in the format of hour and minute, calculate the angle of the hour and minute hand on a clock.
//
//        def calcAngle(h, m):
//        # Fill this in.
//
//        print calcAngle(3, 30)
//        # 75
//        print calcAngle(12, 30)
//        # 165
//*************************************************************************************************************

public class Solution {
    public static void main(String[] args) {
        System.out.println(calcAngle(3,30));
        System.out.println(calcAngle(12,30));
    }

    private static int calcAngle(int hour, int min) {
        //Take the basic angle and then subtract 0.5*min from it.
        int degree = (((min/5)%12)*30 - (hour%12) * 30) - (int)(0.5*min);
        return degree;
    }
}
