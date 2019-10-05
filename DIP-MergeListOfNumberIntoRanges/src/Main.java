//******************************************************************************************************
//Given a sorted list/array of numbers, return a list/array of strings that represent all of the consecutive numbers.
//
//        Example:
//        Input: [0, 1, 2, 5, 7, 8, 9, 9, 10, 11, 15]
//        Output: ['0->2', '5->5', '7->11', '15->15']
//********************************************************************************************************
public class Main {

    public static void main(String[] args) {
        int[] inp = {0, 1, 2, 5, 7, 8, 9, 9, 10, 11, 12,15,16,17,20};
        userPrint(inp);
    }

    private static void userPrint(int[] inp) {
        int n = inp.length;
        int i = 0;
        int start = i;
        while(i<n){
            if(start==(n-1) || i ==(n-1)){
                System.out.println(inp[start]+"->"+inp[i]);
                break;
            }
            if(((inp[i]+1)==inp[i+1]) || (inp[i]==inp[i+1])){
                i = ((i+1)<n)?i+1:i;
            } else {
                System.out.println(inp[start]+"->"+inp[i]);
                start = i+1;
                i = ((i+1)<n)?i+1:i;
            }
        }











    }
}

//        int temp=start+1;
//        while(temp < n && start<=temp){
//            if((inp[temp] == (inp[temp-1]+1)) || (inp[temp-1] == inp[temp])){
//                temp++;
//            } else{
//                System.out.printf("%d->%d,",inp[start],inp[temp-1]);
//                start = temp;
//                temp++;
//            }
//        }

