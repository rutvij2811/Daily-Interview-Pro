//******************************************************************************
//Given two arrays, write a function to compute their intersection -
// the intersection means the numbers that are in both arrays.
//
//        Example 1:
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2]
//        Example 2:
//        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [9,4]
//********************************************************************************


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {9,4,9,8,4};
        int[] nums2 = {4,9,5};
        //Assuming nums2.length < nums1.length
        printIntersection(nums1,nums2);
    }

    private static void printIntersection(int[] nums1, int[] nums2) {
        if(nums1.length < 1 || nums2.length <1){
            System.out.println(0);
        } else {
//            Set<Integer> set = (nums1.length>nums2.length)? IntStream.of(nums1).boxed().collect(Collectors.toCollection(HashSet::new)):
//                    IntStream.of(nums2).boxed().collect(Collectors.toCollection(HashSet::new));
            Set<Integer> set = IntStream.of(nums1).boxed().collect(Collectors.toCollection(HashSet::new));
            List<Integer> result = new ArrayList<>();
            for(int a: nums2){
                if(set.contains(a)){
                    if(!result.contains(a)){
                        result.add(a);
                    }
                }
            }
            for(int a: result){
                System.out.println(a);
            }


        }

    }

}
